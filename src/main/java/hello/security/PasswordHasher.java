package hello.security;

import org.springframework.security.authentication.encoding.BasePasswordEncoder;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

public class PasswordHasher {
    public PasswordHasher() {
    }

    public PasswordHashResults perform(String plaintext) {
        String salt = "fakeSalt";
        return this.perform(plaintext, salt);
    }

    public PasswordHashResults perform(String plaintext, String salt) {
        String hashed = this.getPasswordEncoder().encodePassword(plaintext, salt);
        return new PasswordHashResults(hashed, salt);
    }

    public BasePasswordEncoder getPasswordEncoder() {
        return new ShaPasswordEncoder(256);
    }
}
