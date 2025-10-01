package AstronutTaskScheduler;

import AstronutTaskScheduler.config.Config;
import AstronutTaskScheduler.manager.ScheduleManager;
import AstronutTaskScheduler.model.TaskFactory;
import AstronutTaskScheduler.utils.LoggerFactory;
import AstronutTaskScheduler.exceptions.TaskConflictException;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = Config.shouldRun();
        ScheduleManager manager = ScheduleManager.getInstance();

        logger.info("Astronaut Daily Schedule Organizer started.");

        while (running) {
            printMenu();
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1" -> addTask(scanner, manager);
                case "2" -> removeTask(scanner, manager);
                case "3" -> manager.viewTasks();
                case "0" -> {
                    running = false;
                    logger.info("Exiting application.");
                }
                default -> logger.warning("Invalid choice, try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("""
            ==== Astronaut Daily Schedule ====
            1. Add Task
            2. Remove Task
            3. View Tasks
            0. Exit
            """);
        System.out.print("Choose option: ");
    }

    private static void addTask(Scanner scanner, ScheduleManager manager) {
        try {
            System.out.print("Enter description: ");
            String desc = scanner.nextLine();

            System.out.print("Enter start time (HH:mm): ");
            LocalTime start = LocalTime.parse(scanner.nextLine());

            System.out.print("Enter end time (HH:mm): ");
            LocalTime end = LocalTime.parse(scanner.nextLine());

            System.out.print("Enter priority (Low/Medium/High): ");
            String priority = scanner.nextLine();

            manager.addTask(TaskFactory.createTask(desc, start, end, priority));
        } catch (TaskConflictException e) {
            logger.warning("Conflict: " + e.getMessage());
        } catch (Exception e) {
            logger.severe("Error adding task: " + e.getMessage());
        }
    }

    private static void removeTask(Scanner scanner, ScheduleManager manager) {
        System.out.print("Enter task description to remove: ");
        String desc = scanner.nextLine();
        manager.removeTask(desc);
    }
}
