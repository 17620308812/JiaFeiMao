package jfm.web.server.service.impl;

import jfm.common.user.User;
import jfm.web.server.service.ISessionAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SessionAuthServiceImpl implements ISessionAuthService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User createSession(String userAccount,String userPassword) {
        String body = restTemplate.postForEntity("http://SERVICE-AUTHENTICATION/login", null, String.class).getBody();
        System.err.println(body);
        return null;
    }
}
