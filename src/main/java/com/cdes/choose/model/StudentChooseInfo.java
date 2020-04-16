package com.cdes.choose.model;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "studentchooseinfo")
public class StudentChooseInfo implements Serializable {
    private int id;
    private int stuId;
    private String term;
    private String curriCode;
    private int status;
    private int money;

}
