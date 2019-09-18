package com.xbang.commons.dubbo.entity;

import java.io.Serializable;
import java.util.Random;
import java.util.UUID;

public class UserInfo implements Serializable {

    private Long userId;

    private String userName;

    private Integer userAge;

    private Integer userSex;

    private String address;

    public UserInfo() {
        this(0L,"",0,0);
    }

    public UserInfo(Long userId, String userName, Integer userAge, Integer userSex) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.userSex = userSex;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static UserInfo getRandomUserInfo(){
        Random random = new Random();
        Long userId = System.currentTimeMillis();
        Integer userAge = random.nextInt(100);
        Integer userSex = random.nextInt(1);
        String userName = UUID.randomUUID().toString();
        return new UserInfo(userId,userName,userAge,userSex);

    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userSex=" + userSex +
                ", address='" + address + '\'' +
                '}';
    }
}
