package com.example.bmsbookticket.models;

import lombok.Data;

@Data
public class User{
    private int id;
    private String name;
    private String email;
    private String password;
}
