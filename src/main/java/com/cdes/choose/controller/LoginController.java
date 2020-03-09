package com.cdes.choose.controller;

import com.cdes.choose.model.User;
import com.cdes.choose.service.impl.UserServiceImpl;
import com.cdes.choose.util.Msg;
import com.cdes.choose.util.ResultUtil;
import com.cdes.choose.util.Static;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/chooseCare")
//@CrossOri     gin(origins = "http://127.0.0.2:80")
public class LoginController {
    private static String a = "hello";
    public static void main(String[] args){
        String a = "hello";
    }

    @Autowired
    UserServiceImpl userService;

    /**
     * 用户请求登陆wsqa
     * @param user
     * @return
     */
    @RequestMapping(value = "/loging",method = RequestMethod.POST)
    public Msg Loging(User user, HttpSession session){
        System.out.print("开始登陆。。。。。");
        try {
            User userResult = userService.findByUserId(user.getUserId());
            if (userResult == null) {
                return ResultUtil.error(-201, "该用户未注册");
            } else {
                if (userResult.getPassword().equals(user.getPassword())) {
                    //保存当前登陆者信息到session中
                    session.setAttribute(Static.USER_INFO , userResult);
                    return ResultUtil.success(userResult);
                } else {
                    return ResultUtil.error(-203, "密码错误");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.error(-400,"出现异常");
        }

    }

    /**
     * 用户注册功能，这里只是注册了账号，姓名以及密码。
     * @param user
     * @return
     */
    @RequestMapping(value = "/regiset",method = RequestMethod.POST)
    public Msg regist(User user){
        System.out.print("开始注册。。。");
        boolean flag = false;
        try {
            flag = userService.insertUser(user);
            if(flag){
                return ResultUtil.success();
            }else
                return ResultUtil.error(-202,"该用户账号已经被注册");
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.error(-504,"出现未知异常");
        }
    }
}
