package com.cdes.choose.model;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "role")
public class Role {

    private int roleId;
    private int roleName;
}
