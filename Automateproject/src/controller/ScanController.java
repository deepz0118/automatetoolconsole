package controller;

import java.io.InputStream;

public class ScanController {
    
    public boolean runNmapScan(String targetIP) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(
                "C:\\Program Files (x86)\\Nmap\\nmap.exe", "-sV", targetIP
            );
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            InputStream inputStream = process.getInputStream();
            StringBuilder output = new StringBuilder();

            System.out.println("Scanning Target: " + targetIP);
            int data;
            while ((data = inputStream.read()) != -1) {
                output.append((char) data);
            }
            inputStream.close();

            String result = output.toString();
            System.out.println(result);

            return result.contains("vulnerable") || result.contains("CVE-");
        } catch (Exception e) {
            System.out.println("[X] Error running Nmap: " + e.getMessage());
            return false;
        }
    }
}
