package com.wecp.progressive.entity;
<<<<<<< HEAD
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private String role;
   
    public User() {
    }
 
    public User(int userId, String fullName, String username, String password, String email, String role) {
        this.userId = userId;
        this.fullName = fullName;
=======

public class User {

    int user_id;
    String full_name;
    String username;
    String password;
    String email;
    String role;
    public User(int user_id, String full_name, String username, String password, String email, String role) {
        this.user_id = user_id;
        this.full_name = full_name;
>>>>>>> 4f06e34dfc2e0366bd3b5c08b56117333375e1bc
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
<<<<<<< HEAD
 
    public int getUserId() {
        return userId;
    }
 
    public void setUserId(int userId) {
        this.userId = userId;
    }
 
    public String getFullName() {
        return fullName;
    }
 
    public void setFullName(String fullName) {
        this.fullName = fullName;
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
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getRole() {
        return role;
    }
 
    public void setRole(String role) {
        this.role = role;
    }
 
   
   
=======
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getFull_name() {
        return full_name;
    }
    public void setFull_name(String full_name) {
        this.full_name = full_name;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }


    

    
>>>>>>> 4f06e34dfc2e0366bd3b5c08b56117333375e1bc
}