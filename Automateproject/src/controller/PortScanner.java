//package model;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//
//public class PortScanner extends ScannerModule {
//    public PortScanner(TargetSystem target) {
//        super(target);
//    }
//
//    @Override
//    public String scan() {
//        return executeCommand("nmap -p 1-1000 " + target.getIpAddress());
//    }
//
//    private String executeCommand(String command) throws IOException {
//        Process process = Runtime.getRuntime().exec(command);
//        byte[] outputBytes = process.getInputStream().readAllBytes();  // Read all output bytes
//        return new String(outputBytes, StandardCharsets.UTF_8);  // Convert bytes to string
//    }
//}
package controller;


