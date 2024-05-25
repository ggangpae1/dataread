package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
    @GetMapping("/")
    public String index() {
        return "CI: 코드를 지속적으로 어딘가에 저장, CD: 무중단 배포";
    }
}
