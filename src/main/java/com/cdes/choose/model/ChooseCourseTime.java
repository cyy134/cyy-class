package com.cdes.choose.model;

import lombok.Data;

import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "choosecoursetime")
public class ChooseCourseTime {

    private int times;
    private String endTime;
    private int season;
}
