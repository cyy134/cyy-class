package com.cdes.choose.model;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "chooosestatus")
public class ChooseStatus implements Serializable {

   private int studentId;
   private int courseId;
   private int nowStatus;
}
