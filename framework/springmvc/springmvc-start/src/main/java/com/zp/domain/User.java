package com.zp.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String name;

    private Integer age;
}
