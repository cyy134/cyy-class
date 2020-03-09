package com.cdes.choose.service.inter;

import com.cdes.choose.model.ChooseStatus;
import com.cdes.choose.model.User;

public interface UserService {

     User findByUserId(int userId);
     boolean insertUser(User user);
     boolean updateStudentById(User user);
     boolean updatePassword(int userId, String password);
}
