package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/add")
    public String addTest(@RequestParam int a, @RequestParam int b) {
        int ans = testService.add(a, b);
        return a + "+" + b + "=" + ans;
    }

}
