package com.cdes.choose.service.impl;

import com.cdes.choose.dao.CourseDao;
import com.cdes.choose.model.ChooseStatus;
import com.cdes.choose.model.Course;
import com.cdes.choose.service.inter.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDao courseDao;

    @Override
    public List<Course> getCourseByGrade(String grad) {
        List<Course> courses = courseDao.getCourse(grad);
        return courses;
    }

    @Override
    public int selectcourse(int userId, int courseId) {
        int nowStatus = courseDao.selectNowStatus(userId,courseId);
        return nowStatus;
    }
}
