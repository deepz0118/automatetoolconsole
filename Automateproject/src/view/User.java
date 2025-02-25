package view;

public class User {
    private String username;
    private String role;
    private String email;
    private String phoneNumber;
    private String usageType; // Business or Personal
    private String organization; // Only for business users

    public User(String username, String role, String email, String phoneNumber, String usageType, String organization) {
        this.username = username;
        this.role = role;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.usageType = usageType;
        this.organization = usageType.equalsIgnoreCase("business") ? organization : "N/A";
    }

    public String getUsername() {
        return username;
    }

    public boolean isAdmin() {
        return role.equalsIgnoreCase("admin");
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUsageType() {
        return usageType;
    }

    public String getOrganization() {
        return organization;
    }

    public void displayUserInfo() {
        System.out.println("User Details:");
        System.out.println("Username: " + username);
        System.out.println("Role: " + role);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Usage Type: " + usageType);
        if (usageType.equalsIgnoreCase("business")) {
            System.out.println("Organization: " + organization);
        }
    }
    ScannerModule scanM=new ScannerModule();
    
}
