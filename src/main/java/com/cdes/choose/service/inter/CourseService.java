package com.cdes.choose.service.inter;

import com.cdes.choose.model.ChooseStatus;
import com.cdes.choose.model.Course;

import java.util.List;

public interface CourseService {

    List<Course> getCourseByGrade(String grad);
    public int selectcourse(int userId, int courseId);
}
