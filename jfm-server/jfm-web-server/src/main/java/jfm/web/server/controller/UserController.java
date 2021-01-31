package jfm.web.server.controller;

import jfm.common.response.ServerResponse;
import jfm.web.server.service.ISessionAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private ISessionAuthService sessionAuthService;

    @GetMapping("/login")
    public ServerResponse login(String userName,String userPassword){
        return ServerResponse.successResponse(sessionAuthService.createSession(userName,userPassword));
    }
}
