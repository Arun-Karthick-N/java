import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("1. Add Task\n2. Remove Task\n3. View Tasks\n4. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                try {
                    switch (choice) {
                        case 1 -> {
                            System.out.println("Enter task description:");
                            String description = scanner.nextLine();
                            System.out.println("Enter start time (HH:MM):");
                            String startTime = scanner.nextLine();
                            System.out.println("Enter end time (HH:MM):");
                            String endTime = scanner.nextLine();
                            System.out.println("Enter priority:");
                            String priority = scanner.nextLine();
                            Task task = TaskFactory.createTask(description, startTime, endTime, priority);
                            manager.addTask(task);
                        }
                        case 2 -> {
                            System.out.println("Enter task description to remove:");
                            String removeDescription = scanner.nextLine();
                            manager.removeTask(removeDescription);
                        }
                        case 3 -> manager.viewTasks();
                        case 4 -> {
                            System.out.println("Exiting...");
                            return;
                        }
                        default -> System.out.println("Invalid choice. Try again.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
