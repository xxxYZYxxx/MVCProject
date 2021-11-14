package com.yzy.beans;

import org.springframework.stereotype.Repository;


public class User {
    private String phoneNumber;
    private String username;
    private String password;
    private String mailAddress;

    public User(String phoneNumber, String username, String password, String mailAddress) {
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.mailAddress = mailAddress;
    }

    public User() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }
}
