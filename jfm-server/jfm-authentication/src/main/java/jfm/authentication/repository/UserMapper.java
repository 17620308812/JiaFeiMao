package jfm.authentication.repository;

import jfm.common.user.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    /**
     * 查询用户
     */
    User queryUser(@Param("userAccount") String userAccount, @Param("userPassword") String userPassword);
    /**
     * 新增用户
     */
    int createUser(User user);
}
