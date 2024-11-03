package com.main.controller;

public class UserLoginRequest {
    private String login;  // Changed from username to login
    private String password;

    // Constructor
    public UserLoginRequest() {}

    public UserLoginRequest(String login, String password) {
        this.login = login;
        this.password = password;
    }

    // Getters and Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
