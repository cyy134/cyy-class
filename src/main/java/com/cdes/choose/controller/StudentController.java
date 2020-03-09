package com.cdes.choose.controller;

import com.cdes.choose.model.Course;
import com.cdes.choose.model.User;
import com.cdes.choose.service.impl.CourseServiceImpl;
import com.cdes.choose.service.impl.UserServiceImpl;
import com.cdes.choose.util.Msg;
import com.cdes.choose.util.ResultUtil;
import com.cdes.choose.util.Static;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/students")
//@CrossOrigin(origins = "*",maxAge = 3600)
public class StudentController {

    @Autowired
    CourseServiceImpl courseService;

    @Autowired
    UserServiceImpl userService;

    /**
     *
     * @param password
     * @param session
     * @return
     */
    @RequestMapping(value = "/updatePassword",method = RequestMethod.PUT)
    public Msg updatePassword(@RequestParam("password") String password, HttpSession session){
        System.out.print("开始修改密码。。。");
        boolean flag = false;
        try{
            User user = (User) session.getAttribute(Static.USER_INFO);
            flag = userService.updatePassword(user.getUserId(), password);
            if(flag){
                return ResultUtil.success();
            }else {
                return ResultUtil.error(-200,"修改密码失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.error(-504,"出现未知错误");
        }
    }

    @RequestMapping(value = "/getNowStatus",method = RequestMethod.GET)
    public Msg getNowStatus(@RequestParam("courseId") int courseId, HttpSession session){
        System.out.print("开始获取此条课程在当前学生下的状态....");
        try {
            User user = (User) session.getAttribute(Static.USER_INFO);
            int nowStatus = courseService.selectcourse(user.getUserId(),courseId);
            if(nowStatus != 0){
                return ResultUtil.success2(100,"成功",nowStatus);
            }else
                return ResultUtil.error(-100,"失败");
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.error(-502,"未知异常");
        }
    }

    @RequestMapping(value = "/getCourse",method = RequestMethod.GET)
    public Msg getCourses(@RequestParam("grad") String grade){
        System.out.print("来说获取所有的符合当前登陆者需要的课程信息。。。");
        try {
            List<Course> courses = courseService.getCourseByGrade(grade);
            if(courses.size() == 0){
                return ResultUtil.error(-1,"没有符合条件的课程");
            }else
                return ResultUtil.success2(200,"得到所有符合登陆者年级的课程信息",courses);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.error(-200,"出现未知异常");
        }
    }
}
