package com.cdes.choose.model;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "sendhistory")
public class SendHistory implements Serializable {
    private int id;
    private int times;
    private Date time;
    private int status;
    private int type;
}
