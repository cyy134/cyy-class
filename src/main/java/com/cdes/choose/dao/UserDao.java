package com.cdes.choose.dao;

import com.cdes.choose.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {

    /**
     * 修改密码
     * @param
     * @return
     */
    @Update("update user set password = #{password} where userId = #{userId}")
    int  updatePassword(@Param("userId") int userId, @Param("password") String password);

    //根据用户id查找用户信息
    @Select("SELECT * FROM user Where userId =#{userId}")
    User findById(@Param("userId") int userId);

    @Insert("insert into user(userId,password,userName) values(#{userId},#{password},#{userName})")
    int  insertUser(User user);

    @Update("update user set userName = #{userName}, grad = #{grad}, hadCredit = #{hadCredit} where userId = #{userId}")
    int  updateStudentById(User user);

}
