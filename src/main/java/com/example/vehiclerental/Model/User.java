package com.example.vehiclerental.Model;

import lombok.Data;

@Data
public class User {

    private int id;
    private String name;
    private String licenceId;
    private String adharId;
    private String userName;
    private String phoneNumber;
    private String email;
    private String password;

    private UserType userType;

}
