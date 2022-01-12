package jfm.authentication.dao;

import jfm.common.pojo.JfmUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    /**
     * 查询用户
     */
    JfmUser queryUser(@Param("userCode") String userCode, @Param("userPassword") String userPassword);
    /**
     * 新增用户
     */
    int createUser(JfmUser user);
}
