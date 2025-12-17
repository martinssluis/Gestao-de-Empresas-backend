package com.aceleradev.backend.resources;

import com.aceleradev.backend.model.UserType;
import com.aceleradev.backend.services.AuthService;
import com.aceleradev.backend.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    private AuthService authService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> login (@RequestParam String email, @RequestParam String password, @RequestParam UserType userType){
        logger.info("Login attempt for email: {}", email);

        try {
            Object user = authService.authenticate(email, password, userType);
            String token = jwtUtil.generateToken(email);
            logger.info("Login successful for email: {}", email);
            return ResponseEntity.ok().body(token);

        } catch (IllegalArgumentException e){
            logger.warn("Login failed for email {}", email);
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
