package jfm.authentication.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @PostMapping("/login")
    public String test(){
        return "HELLO WORLD";
    }
}
