package com.example.vincent.myapplication;

import java.io.Serializable;

/**
 * Created by vincent on 16/4/19.
 */
public class UserBean implements Serializable {
    String username = "";
    String password = "";

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
}
