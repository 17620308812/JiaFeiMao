package jfm.authentication.service;


import jfm.common.user.User;

public interface ISessionAuthService {
    /**
     * 创建会话 登陆
     */
    User createSession(User user);
    /**
     * 创建用户
     */
    void createUser(User user);
}
