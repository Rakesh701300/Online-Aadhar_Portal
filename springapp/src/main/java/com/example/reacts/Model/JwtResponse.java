package com.example.reacts.Model;

public class JwtResponse {

    private UserModel user;
    private String jwtToken;

    // No-argument constructor
    public JwtResponse() {}

    // Constructor with all fields
    public JwtResponse(UserModel user, String jwtToken) {
        this.user = user;
        this.jwtToken = jwtToken;
    }

    // Getter and Setter for user
    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    // Getter and Setter for jwtToken
    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
