package com.zp.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhoupeng
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
