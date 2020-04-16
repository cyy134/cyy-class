package com.cdes.choose.model;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;


@Data
@Table(name = "user")
public class User implements Serializable {
    private int userId;
    private String password;
    private String userName;
    private String grad;
    private int hadCredit;
    private int choosedCredit;
    private int suggestCredit;
    private int limitCredit;
    private int firstLevel;
    private int roleId;
    private int stats;
    private String studentType;
}
