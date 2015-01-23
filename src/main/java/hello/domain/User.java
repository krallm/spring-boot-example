package hello.domain;

import hello.form.RegistrationInfo;
import hello.security.PasswordHasher;
import hello.security.PasswordHashResults;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String emailAddress;

    @Column(nullable = false)
    private String hashedPassword;

    @Column(nullable = false)
    private String salt;

    public User(RegistrationInfo regInfo) {
        this.username = regInfo.getUsername();
        this.emailAddress = regInfo.getEmailAddress();

        PasswordHasher hasher = new PasswordHasher();
        PasswordHashResults hashResults = hasher.perform(regInfo.getPassword());
        this.hashedPassword = hashResults.getHashedPassword();
        this.salt = hashResults.getSalt();
    }

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getHashedPassword() {
        return this.hashedPassword;
    }

    public String getSalt() {
        return this.salt;
    }
}
