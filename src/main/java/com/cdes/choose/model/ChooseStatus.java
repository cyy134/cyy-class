package com.cdes.choose.model;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "chooosestatus")
public class ChooseStatus {

   private int studentId;
   private int courseId;
   private int nowStatus;
}
