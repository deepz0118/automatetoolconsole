package app; 

import controller.ScanController;
import view.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your username: ");
        String username = sc.nextLine();

        System.out.print("Enter your role (admin/user): ");
        String role = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = sc.nextLine();

        System.out.print("Is this for business or personal use? ");
        String usageType = sc.nextLine();

        String organization = "N/A";
        if (usageType.equalsIgnoreCase("business")) {
            System.out.print("Enter your organization name: ");
            organization = sc.nextLine();
        }

        System.out.print("Enter target IP: ");
        String targetIP = sc.nextLine();

        ScanController scannerModule = new ScanController(); 
        scannerModule.runNmapScan(targetIP);

    }
}
