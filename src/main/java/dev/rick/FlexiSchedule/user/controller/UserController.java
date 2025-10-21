package dev.rick.FlexiSchedule.user.controller;

import dev.rick.FlexiSchedule.user.domain.UserModel;
import dev.rick.FlexiSchedule.user.service.UserServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServices services;

    public UserController(UserServices services) {
        this.services = services;
    }

    @PostMapping("/salvar")
    public ResponseEntity<UserModel> salvar(@RequestBody UserModel user){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                    .body(services
                            .save(user));
    }

}
