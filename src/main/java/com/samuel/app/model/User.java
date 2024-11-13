package com.samuel.app.model;

import jakarta.persistence.*;

@Entity
@Table(name ="user")
public class User {
    @Id
    private String id;

    private String name;
    private String userName;
    private String password;
    private String userRoleId;

    public User(String id, String name, String userName, String password, String userRoleId) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.userRoleId = userRoleId;
    }

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(String userRoleId) {
        this.userRoleId = userRoleId;
    }
}
