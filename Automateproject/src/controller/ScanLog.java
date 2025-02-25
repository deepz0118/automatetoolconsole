package controller;



import java.util.Date;

public class ScanLog {
    private String username;
    private String targetIP;
    private String scanResult;
    private Date timestamp;

    public ScanLog(String username, String targetIP, String scanResult) {
        this.username = username;
        this.targetIP = targetIP;
        this.scanResult = scanResult;
        this.timestamp = new Date();
    }

    public String getUsername() {
        return username;
    }

    public void displayLog() {
        System.out.println("[Details]" + timestamp + " | User: " + username + " | Target: " + targetIP + " | Result: " + scanResult);
    }
}
