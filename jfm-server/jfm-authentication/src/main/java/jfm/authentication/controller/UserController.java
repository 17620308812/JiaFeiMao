package jfm.authentication.controller;

import jfm.authentication.service.ISessionAuthService;
import jfm.common.response.ServerResponse;
import jfm.common.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ISessionAuthService sessionAuthService;

    @PostMapping("/login")
    public ServerResponse login(@RequestBody User user) {
        User session = sessionAuthService.createSession(user);
        return ServerResponse.successResponse(session);
    }

    @PostMapping("/insert")
    public ServerResponse insertUser(@RequestBody User user) {
        sessionAuthService.createUser(user);
        return ServerResponse.success();
    }
}
