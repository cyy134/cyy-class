package com.cdes.choose.model;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "course")
public class Course implements Serializable {

    private int courseId;
    private String courseName;
    private int credit;
    private int classHours;
    private String term;
    private String grade;
    private String studentType;
    private int classSize;
    private int price;
    private int status;
    private int chosseNum;

    private String chooseIf;//当前课程是否被当前登陆者选择了

    private int host;
}
