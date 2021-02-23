package jfm.authentication.service;


import jfm.common.user.User;

public interface ISessionAuthService {
    /**
     * 创建session
     */
    User createSession(User user) throws Exception;
}
