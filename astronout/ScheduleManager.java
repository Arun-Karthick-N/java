import java.util.*;

public class ScheduleManager {
    private static ScheduleManager instance;
    private final List<Task> tasks;  // Changed to final
    
    private ScheduleManager() {
        tasks = new ArrayList<>();
    }
    
    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }
    
    public void addTask(Task task) throws Exception {
        if (isOverlapping(task)) {
            throw new Exception("Task conflicts with existing tasks.");
        }
        tasks.add(task);
        Collections.sort(tasks, Comparator.comparing(Task::getStartTime));
        System.out.println("Task added successfully. No conflicts.");
    }

    public void removeTask(String description) throws Exception {
        boolean removed = tasks.removeIf(task -> task.getDescription().equals(description));
        if (!removed) {
            throw new Exception("Task not found.");
        }
        System.out.println("Task removed successfully.");
    }
    
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }
        tasks.forEach(System.out::println);
    }

    private boolean isOverlapping(Task newTask) {
        for (Task task : tasks) {
            if (task.getStartTime().isBefore(newTask.getEndTime()) &&
                newTask.getStartTime().isBefore(task.getEndTime())) {
                return true;
            }
        }
        return false;
    }
}
