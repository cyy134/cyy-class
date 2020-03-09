package com.cdes.choose.service.inter;

import com.cdes.choose.model.ChooseCourseTime;
import com.cdes.choose.model.Course;

import java.util.List;

public interface TeacherService {

    boolean insertChooseCourseTime(ChooseCourseTime chooseCourseTime);

    List<Course> getCourseHost();
}
