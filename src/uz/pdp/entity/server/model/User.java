package uz.pdp.entity.server.model;
import uz.pdp.entity.server.enums.Role;

import java.util.ArrayList;
import java.util.List;

public class User extends BaseModel {
    private final String fullName; // Eshmatov Toshmat
    private final String phoneNumber; // +998XXYYYYYYY
    private String password; // "***"
    private double balance;
    private final List<Role> roles;

    public User(String fullName, String phoneNumber, String password) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        balance = 0;
        roles = new ArrayList<>();
        roles.add(Role.USER);
    }

    public User(String fullName, String phoneNumber, List<Role> roles) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.roles = roles;
        balance = 0;
        roles = new ArrayList<>();
        roles.add(Role.USER);
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Role> getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", roles=" + roles +
                '}';
    }
}
