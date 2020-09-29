package com.example.nkg.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/greeting")
    String greeting() {
        return "ALL IS WELL !!!";
    }
}
