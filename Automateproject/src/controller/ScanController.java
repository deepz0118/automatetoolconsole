package controller;

import java.util.ArrayList;
import java.util.List;

public class ScanController {
    
    public boolean runNmapScan(String targetIP) {
        try {
            Process process = new ProcessBuilder(
                "C:\\Program Files (x86)\\Nmap\\nmap.exe", "-sV", targetIP
            ).start();

            int exitCode = process.waitFor();
            System.out.println("Scanning Target: " + targetIP);
            System.out.println("Scan Completed with exit code: " + exitCode);

            return exitCode == 0; 

        } catch (Exception e) {
            System.out.println("[X] Error running Nmap: " + e.getMessage());
            return false;
        }
    }

}
