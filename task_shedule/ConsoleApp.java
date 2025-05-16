import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

// Task Class
class Task {
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;
    private String priority;

    public Task(String description, LocalTime startTime, LocalTime endTime, String priority) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
    }

    public String getDescription() { return description; }
    public LocalTime getStartTime() { return startTime; }
    public LocalTime getEndTime() { return endTime; }
    public String getPriority() { return priority; }

    @Override
    public String toString() {
        return String.format("%s - %s: %s [%s]", startTime, endTime, description, priority);
    }
}

// TaskFactory Class
class TaskFactory {
    public static Task createTask(String description, String startTimeStr, String endTimeStr, String priority) {
        LocalTime startTime = LocalTime.parse(startTimeStr);
        LocalTime endTime = LocalTime.parse(endTimeStr);
        return new Task(description, startTime, endTime, priority);
    }
}

// ConflictObserver Interface
interface ConflictObserver {
    void notifyConflict(Task conflictingTask, Task existingTask);
}

// ScheduleManager Class (Singleton)
class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private List<ConflictObserver> observers;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static synchronized ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addObserver(ConflictObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ConflictObserver observer) {
        observers.remove(observer);
    }

    public boolean addTask(Task newTask) {
        for (Task task : tasks) {
            if (task.getStartTime().isBefore(newTask.getEndTime()) &&
                newTask.getStartTime().isBefore(task.getEndTime())) {
                notifyConflict(newTask, task);
                return false;
            }
        }
        tasks.add(newTask);
        return true;
    }

    public boolean removeTask(String description) {
        Optional<Task> taskToRemove = tasks.stream()
                .filter(task -> task.getDescription().equals(description))
                .findFirst();
        if (taskToRemove.isPresent()) {
            tasks.remove(taskToRemove.get());
            return true;
        }
        return false;
    }

    public List<Task> getTasks() {
        Collections.sort(tasks, (t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()));
        return tasks;
    }

    private void notifyConflict(Task conflictingTask, Task existingTask) {
        for (ConflictObserver observer : observers) {
            observer.notifyConflict(conflictingTask, existingTask);
        }
    }
}

// ConsoleApp Class
public class ConsoleApp {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        manager.addObserver((conflictingTask, existingTask) -> 
            System.out.println("Error: Task conflicts with existing task \"" + existingTask.getDescription() + "\".")
        );

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Description: ");
                        String desc = scanner.nextLine();
                        System.out.print("Start Time (HH:MM): ");
                        String start = scanner.nextLine();
                        System.out.print("End Time (HH:MM): ");
                        String end = scanner.nextLine();
                        System.out.print("Priority (High/Medium/Low): ");
                        String priority = scanner.nextLine();
                        
                        Task task = TaskFactory.createTask(desc, start, end, priority);
                        if (manager.addTask(task)) {
                            System.out.println("Task added successfully.");
                        } else {
                            System.out.println("Failed to add task due to conflict.");
                        }
                        break;
                    
                    case 2:
                        System.out.print("Task Description to Remove: ");
                        String removeDesc = scanner.nextLine();
                        if (manager.removeTask(removeDesc)) {
                            System.out.println("Task removed successfully.");
                        } else {
                            System.out.println("Error: Task not found.");
                        }
                        break;
                    
                    case 3:
                        List<Task> tasks = manager.getTasks();
                        if (tasks.isEmpty()) {
                            System.out.println("No tasks scheduled for the day.");
                        } else {
                            for (Task t : tasks) {
                                System.out.println(t);
                            }
                        }
                        break;
                    
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    
                    default:
                        System.out.println("Invalid option. Try again.");
                        break;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Error: Invalid time format.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
