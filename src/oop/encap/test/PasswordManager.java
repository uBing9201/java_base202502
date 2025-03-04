package oop.encap.test;

public class PasswordManager {

    // 비밀번호
    private String password;

    public PasswordManager(String password) {
        this.password = password;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)) {
            password = newPassword;
            return true;
        }
        return false;
    }
}
