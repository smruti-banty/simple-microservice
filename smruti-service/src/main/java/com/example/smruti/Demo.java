package com.example.smruti;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/smruti")
public class Demo {
    @GetMapping("/hello")
    String hello() {
        return "Hello from smruti service";
    }
}
