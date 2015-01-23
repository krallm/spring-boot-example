package hello.form;

import javax.validation.constraints.NotNull;

public class RegistrationInfo {
    @NotNull
    private String emailAddress;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String passwordConfirmation;

    public String getUsername() {
        return this.username;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getPassword() {
        return this.password;
    }
}
