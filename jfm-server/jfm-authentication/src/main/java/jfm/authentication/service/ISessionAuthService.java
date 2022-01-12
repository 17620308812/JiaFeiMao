package jfm.authentication.service;


import jfm.common.pojo.JfmUser;

public interface ISessionAuthService {
    /**
     * 创建会话 登陆
     */
    JfmUser createSession(JfmUser user);
    /**
     * 创建用户
     */
    void createUser(JfmUser user);
}
