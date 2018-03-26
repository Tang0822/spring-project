package com.jftang3.auth.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseEntity {

    public Date createTime;

    public Date updateTime;
}
