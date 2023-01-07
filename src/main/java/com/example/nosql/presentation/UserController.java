package com.example.nosql.presentation;

import com.example.nosql.application.impl.DefineUserAccess;
import com.example.nosql.infrastructure.entity.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final DefineUserAccess userAccess;

    @PostMapping("/user")
    public ResponseEntity<UserResponse> save()
    {
        return null;
    }
}
