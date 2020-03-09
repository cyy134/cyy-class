package com.cdes.choose.dao;

import com.cdes.choose.model.ChooseStatus;
import com.cdes.choose.model.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CourseDao{

    @Select("select * from course where grade = #{grad}")
    List<Course> getCourse(@Param("grad") String grad);
    /**
     * 查看当条课程数据是否已被当前学生选中
     */
    @Select("select nowStatus from chooosestatus where studentId = #{studentId} and courseId = #{courseId}")
    int selectNowStatus(@Param("studentId") int studentId,
                        @Param("courseId") int courseId);
}
