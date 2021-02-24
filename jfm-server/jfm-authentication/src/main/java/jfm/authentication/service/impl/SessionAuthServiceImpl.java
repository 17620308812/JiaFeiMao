package jfm.authentication.service.impl;

import jfm.authentication.repository.UserMapper;
import jfm.common.user.User;
import jfm.authentication.service.ISessionAuthService;
import jfm.common.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class SessionAuthServiceImpl implements ISessionAuthService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 创建会话 登陆
     */
    @Override
    public User createSession(User user) {

        String md5Password = DigestUtils.md5DigestAsHex(user.getUserPassword().getBytes());
        userMapper.queryUser(user.getUserAccount(),md5Password);

        return null;
    }

    /**
     * 创建用户
     */
    @Override
    public void createUser(User user){
        String md5Password = DigestUtils.md5DigestAsHex(user.getUserPassword().getBytes());
        user.setUserPassword(md5Password);
        user.setStatus("0");
        user.setUserRegisterDate(DateUtil.getCurrentDate());
        user.setUserRegisterTime(DateUtil.getCurrentTime());
        userMapper.createUser(user);
    }
}
