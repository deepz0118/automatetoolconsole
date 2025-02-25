package controller;

import java.util.Date;

public class ScanLog {
    private String targetIP;
    private String scanResult;

    public ScanLog(String targetIP, String scanResult) {
        this.targetIP = targetIP;
        this.scanResult = scanResult;
    }

    public void displayLog() {
        System.out.println("[LOG] " + new Date() + " - " + targetIP + ": " + scanResult);
    }
}
