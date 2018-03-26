package com.jftang3.auth.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Permission extends BaseEntity {

    private Integer id;

    private String name;

    private String url;

    private String description;

    private String method;
}
