package view;

public class User {
    private String username;
    private String role;
    private String email;

    public User(String username, String role, String email) {
        this.username = username;
        this.role = role;
        this.email = email;
    }

    public boolean isAuthenticatedAdmin() {
        return role.equalsIgnoreCase("admin") && email.equalsIgnoreCase("admin@gmail.com");
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdmin() {
        return role.equalsIgnoreCase("admin");
    }
}
