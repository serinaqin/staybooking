package com.serina.staybooking.authentication;

import com.serina.staybooking.model.LoginRequest;
import com.serina.staybooking.model.LoginResponse;
import com.serina.staybooking.model.RegisterRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
public class AuthenticationController {


    private final AuthenticationService authenticationService;


    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }


    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody RegisterRequest body) {
        authenticationService.register(body.username(), body.password(), body.role());
    }


    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest body) {
        String token = authenticationService.login(body.username(), body.password());
        return new LoginResponse(token);
    }
}

