package app;

import controller.ScanController;
import controller.ScanLog;
import view.User;

import java.util.*;

public class Main {
    private static final List<ScanLog> scanLogs = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter role (admin/user): ");
        String role = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        User usr = new User(username, role, email);
        ScanController scannerModule = new ScanController();

        while (true) { 
            System.out.println("\n---MENU---");
            System.out.println("1. Run a new scan");
            System.out.println("2. View scan history");
            System.out.println("3. Exit (Return to Menu)");
            System.out.print("Enter choice: ");

            if (!scanner.hasNextInt()) {  
                System.out.println("[X] Invalid input. Please enter a number.");
                scanner.next(); 
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter target IP: ");
                    String targetIP = scanner.nextLine();

                    boolean foundVuln = scannerModule.runNmapScan(targetIP);
                    String scanResult = foundVuln ? "[!] Vulnerabilities Found" : "No Major Issues";

                    ScanLog log = new ScanLog(username, targetIP, scanResult);
                    scanLogs.add(log);
                    log.displayLog();
                    break;

                case 2:
                    if (usr.isAuthenticatedAdmin()) {
                        System.out.println("\n Full Scan History (Admin Access)");
                        if (scanLogs.isEmpty()) {
                            System.out.println("No scan history available.");
                        } else {
                            for (ScanLog logEntry : scanLogs) {
                                logEntry.displayLog();
                            }
                        }
                    } else {
                        System.out.println("\n Scan History for: " + username);
                        boolean hasLogs = false;
                        for (ScanLog logEntry : scanLogs) {
                            if (logEntry.getUsername().equals(username)) {
                                logEntry.displayLog();
                                hasLogs = true;
                            }
                        }
                        if (!hasLogs) {
                            System.out.println("No previous scans found.");
                        }
                    }
                    break;

                case 3:
                    break; 

                default:
                    System.out.println("[X] Invalid choice. Try again.");
            }
        }
    }
}
