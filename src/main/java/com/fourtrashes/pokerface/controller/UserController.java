package com.fourtrashes.pokerface.controller;

import com.fourtrashes.pokerface.domain.User;
import com.fourtrashes.pokerface.domain.request.UserCreationRequest;
import com.fourtrashes.pokerface.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/pokerface")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UserController {

    private final UserService userService;


    @PostMapping("/sign-up")
    public ResponseEntity<User> insertUser (@RequestBody UserCreationRequest request){
        System.out.println("request = " + request);
        return ResponseEntity.ok(userService.createUser(request));
    }
}
