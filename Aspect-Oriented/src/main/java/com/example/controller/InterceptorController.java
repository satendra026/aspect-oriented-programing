package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class InterceptorController {

    @GetMapping("/interceptor")
    public ResponseEntity<String> checkInteceptor(){
        System.out.println("result executed successfully");
        return new ResponseEntity<>("result executed successfully", HttpStatus.OK);
    }
}
