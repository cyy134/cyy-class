package com.cdes.choose.model;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "studentchooseinfo")
public class StudentChooseInfo {
    private int id;
    private int stuId;
    private String term;
    private String curriCode;
    private int status;
    private int money;

}
