package com.systechafrica.part2.interfaces;

public class User {
    private String id;
    private String userId;
    private String username;
    

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", userId=" + userId + ", username=" + username + "]";
    }

    
    
    
    
}
