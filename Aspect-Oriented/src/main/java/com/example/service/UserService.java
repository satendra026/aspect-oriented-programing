package com.example.service;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUser() {
int id=1;
        if (id == 1) {
            System.out.println("Fetching user details...");

        } else {
            throw new RuntimeException("User not found!");
        }
        return  "success...";
//        System.out.println("Fetching user details...");
    }
}