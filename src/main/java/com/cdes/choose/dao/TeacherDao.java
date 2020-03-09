package com.cdes.choose.dao;

import com.cdes.choose.model.ChooseCourseTime;
import com.cdes.choose.model.Course;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TeacherDao {

    @Insert("insert into choosecoursetime(times,endTime,season) values(#{times}, #{endTime}, #{season})")
    void insertChooseCourseTime(ChooseCourseTime chooseCourseTime);

    @Select("select b.*,count(*) host from chooosestatus a Left Join course b on b.courseId = a.courseId where a.nowStatus=1 group by a.courseId order by host desc")
    List<Course> getCourseHost();
}
