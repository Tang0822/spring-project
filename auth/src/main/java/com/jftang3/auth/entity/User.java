package com.jftang3.auth.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User extends BaseEntity {

    private Integer id;

    private String username;

    private String password;

    private String realName;

    private Long mobile;

    private Date registTime;

    private Date loginTime;

    private Integer groupId;

}
