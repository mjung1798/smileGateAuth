package com.ex.smile_authserver.Dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User
{
    private int userId;
    private String userName;
    private String email;
    private String password;
    private String authority; //Enum 사용을 하고 싶다..
    private Timestamp createTime;
    private Timestamp updateTime;
}
