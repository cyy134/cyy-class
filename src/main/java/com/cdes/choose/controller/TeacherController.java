package com.cdes.choose.controller;

import com.cdes.choose.model.ChooseCourseTime;
import com.cdes.choose.model.Course;
import com.cdes.choose.service.impl.TeacherServiceImpl;
import com.cdes.choose.util.Msg;
import com.cdes.choose.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherServiceImpl teacherService;

    @RequestMapping(value = "/insertChooseTime", method = RequestMethod.POST)
    public Msg insertChooseCourse(ChooseCourseTime chooseCourseTime){
        System.out.print("开始添加选课时间。。。。");
        try{
            boolean flag = teacherService.insertChooseCourseTime(chooseCourseTime);
            if(flag){
                return ResultUtil.success();
            }else
                return ResultUtil.error(-200,"添加失败");
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.error(-504,"发生未知异常");
        }
    }

    @RequestMapping(value = "/getCourseHost", method = RequestMethod.GET)
    public Msg getCourseHost(){
        System.out.print("开始获取课程热度。。。");
        try {
            List<Course> courseList = teacherService.getCourseHost();
            if(courseList.size() !=0){
                return ResultUtil.success2(200,"获取数据成功",courseList);
            }else
                return ResultUtil.error(-200,"当前还没有人选课，无法判断。");
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.error(-504,"发生未知错误");
        }
    }

}
