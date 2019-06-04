package com.borris.sc.client.pojo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class User {
    private String id;
    private String name;
    private String password;
    private Date createTime;
    private Date updateTime;

}
