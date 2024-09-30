package com.trackit.user_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

  @GetMapping
  public ResponseEntity<String> testService() {
    return ResponseEntity.ok("Hello World :)");
  }

}
