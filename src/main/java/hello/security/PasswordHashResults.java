package hello.security;

public class PasswordHashResults {
    private String hashedPassword;
    private String salt;

    public PasswordHashResults(String hashedPassword, String salt) {
        this.hashedPassword = hashedPassword;
        this.salt = salt;
    }

    public String getHashedPassword() {
        return this.hashedPassword;
    }

    public String getSalt() {
        return this.salt;
    }
}
