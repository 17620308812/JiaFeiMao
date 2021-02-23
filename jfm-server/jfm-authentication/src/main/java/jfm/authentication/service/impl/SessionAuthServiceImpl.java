package jfm.authentication.service.impl;

import jfm.common.user.User;
import jfm.authentication.service.ISessionAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SessionAuthServiceImpl implements ISessionAuthService {



    @Override
    public User createSession(User user) throws Exception {


        return null;
    }
}
