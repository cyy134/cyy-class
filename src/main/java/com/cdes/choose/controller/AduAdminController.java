package com.cdes.choose.controller;

import com.cdes.choose.model.User;
import com.cdes.choose.service.impl.UserServiceImpl;
import com.cdes.choose.util.Msg;
import com.cdes.choose.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aduadmin")
//@CrossOrigin(origins = "*",maxAge = 3600)
public class AduAdminController {

    @Autowired
    UserServiceImpl userService;

    //根据学号查找学生信息
    @RequestMapping(value = "/getStudentById",method = RequestMethod.GET)
    public Msg getStudentById(Integer userId){
        System.out.print("开始按照学号查找学生......");
        if (userId == null){
            return ResultUtil.error(-200,"请输入学生学号");
        }
        try {
            User user = userService.findByUserId(userId);
            if(user == null){
                return ResultUtil.error(-200,"没有查询到此用户");
            }else {
                return ResultUtil.success2(200,"查询到此用户",user);
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.error(-504,"发生未知异常");
        }
    }

    @RequestMapping(value = "/updateStudentInfo",method = RequestMethod.PUT)
    public Msg updateStudentInfo(User user){
        System.out.print("开始修改学生信息。。。。");
        try {
            boolean flag = userService.updateStudentById(user);
            if(flag){
                User user1 = userService.findByUserId(user.getUserId());
                return ResultUtil.success2(200,"修改信息成功",user1);
            }else
                return ResultUtil.error(-200,"修改信息失败");
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.error(-504,"发生未知异常");
        }
    }

}
