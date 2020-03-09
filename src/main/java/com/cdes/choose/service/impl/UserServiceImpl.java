package com.cdes.choose.service.impl;

import com.cdes.choose.dao.UserDao;
import com.cdes.choose.model.ChooseStatus;
import com.cdes.choose.model.User;
import com.cdes.choose.service.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User findByUserId(int userId) {
        return userDao.findById(userId);
    }

    @Override
    public boolean insertUser(User user) {
        boolean flag = false;
        try {
            userDao.insertUser(user);
            flag = true;
        }catch (Exception e ){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateStudentById(User user) {
        boolean flag = false;
        try{
            userDao.updateStudentById(user);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean updatePassword(int userId, String password) {
        boolean flag = false;
        try{
            userDao.updatePassword(userId,password);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }

}
