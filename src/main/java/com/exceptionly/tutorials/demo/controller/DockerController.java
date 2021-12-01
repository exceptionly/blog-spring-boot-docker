package com.exceptionly.tutorials.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

  @GetMapping("/ping")
  public ResponseEntity<String> askQuestion() {
    return ResponseEntity.ok("pong");
  }
}
