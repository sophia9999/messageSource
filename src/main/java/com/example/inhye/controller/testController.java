package com.example.inhye.controller;

import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController(value = "/")
public class testController {

    private final MessageSource ms;

    public testController(MessageSource ms) {
        this.ms = ms;
    }

    @GetMapping("test1")
    public ResponseEntity<String> validEmailForEng() {
        return ResponseEntity.status(200).body(ms.getMessage("email.notempty", null, Locale.US));
    }

    @GetMapping("test2")
    public ResponseEntity<String> validEmailForKor() {
        return ResponseEntity.status(200).body(ms.getMessage("email.notempty", null, Locale.KOREA));
    }

    Object[] o = {"스프링", "20"};
    @GetMapping("test3")
    public ResponseEntity<String> introduceEng() {
        return ResponseEntity.status(200).body(ms.getMessage("introduce", o, Locale.US));
    }

    @GetMapping("test4")
    public ResponseEntity<String> introduceKor() {
        return ResponseEntity.status(200).body(ms.getMessage("introduce", o, Locale.KOREA));
    }
}
