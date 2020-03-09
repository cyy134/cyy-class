package com.cdes.choose.dao;

import com.cdes.choose.model.StudentChooseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentChooseeInfo {

    @Select("select * from studentchooseinfo")
    List<StudentChooseInfo> getstdenChooseInfos();

    @Select("select * from studentchooseinfo where id = #{id}")
    StudentChooseInfo getOneStudentChooseInfo(int id);

    @Select("select * from studentchooseinfo where stuId = #{id}")
    StudentChooseInfo getOnStudentChooseInfoByStuId(int id);

}
