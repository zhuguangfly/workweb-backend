package com.example.workweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class WorkController {
    @GetMapping("/work")
    public Map<String, String> work() {
        return Map.of("message", "干活成功，点击继续干活");
    }

    @GetMapping("/exit")
    public Map<String, String> exit() {
        return Map.of("message", "退出干活成功，曾吉超自由了！");
    }
}

