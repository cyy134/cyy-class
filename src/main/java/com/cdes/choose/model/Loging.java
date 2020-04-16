package com.cdes.choose.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Loging implements Serializable {

    private int logingId;
    private String password;
    private int stats;
}
