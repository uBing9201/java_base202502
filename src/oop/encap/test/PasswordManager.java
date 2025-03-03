package oop.encap.test;

public class PasswordManager {

    // 비밀번호
    private String password;

    public boolean changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)) {
            password = newPassword;
            return true;
        }else{
            return false;
        }
    }

    public PasswordManager(String password) {
        this.password = password;
    }
}
