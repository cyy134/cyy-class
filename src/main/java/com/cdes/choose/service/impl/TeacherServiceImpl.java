package com.cdes.choose.service.impl;

import com.cdes.choose.dao.TeacherDao;
import com.cdes.choose.model.ChooseCourseTime;
import com.cdes.choose.model.Course;
import com.cdes.choose.service.inter.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherDao teacherDao;

    @Override
    public boolean insertChooseCourseTime(ChooseCourseTime chooseCourseTime) {
        System.out.print("开始增加选课时间。。。。。");
        boolean flag = false;
        try {
            teacherDao.insertChooseCourseTime(chooseCourseTime);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }

    @Override
    public List<Course> getCourseHost() {
        System.out.print("开始按照选课热度排课");
        return teacherDao.getCourseHost();
    }
}
