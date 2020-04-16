package com.cdes.choose.model;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "role")
public class Role implements Serializable {

    private int roleId;
    private int roleName;
}
