package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class VersionController {

    @Value("${app.version:unknown}")
    private String appVersion;

    @GetMapping("/version")
    public Map<String, String> version() {
        return Map.of("version of this", appVersion);
    }
}