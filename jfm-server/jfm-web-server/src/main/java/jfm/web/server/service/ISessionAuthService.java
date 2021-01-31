package jfm.web.server.service;


import jfm.common.user.User;

public interface ISessionAuthService {
    /**
     * 创建session
     */
    User createSession(String userAccount,String userPassword);
}
