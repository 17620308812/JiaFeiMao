package jfm.authentication.controller;

import jfm.common.response.ServerResponse;
import jfm.common.user.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    public ServerResponse login(@RequestBody User user) {

    }
}
