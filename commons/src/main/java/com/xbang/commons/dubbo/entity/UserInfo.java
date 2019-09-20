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

    private String provider;

    public UserInfo() {
        this(0L,"",0,0,"");
    }

    public UserInfo(Long userId, String userName, Integer userAge, Integer userSex,String address) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.userSex = userSex;
        this.address = address;
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

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public static UserInfo getRandomUserInfo(){
        Random random = new Random();
        Long userId = System.currentTimeMillis();
        Integer userAge = random.nextInt(100);
        Integer userSex = random.nextInt(1);
        String userName = UUID.randomUUID().toString();
        String address = "中国北京";
        return new UserInfo(userId,userName,userAge,userSex,address);

    }

    public static  UserInfo getRandomUserInfo(String provider){
        UserInfo userInfo = getRandomUserInfo();
        userInfo.setProvider(provider);
        return userInfo;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userSex=" + userSex +
                ", address='" + address + '\'' +
                ", provider='" + provider + '\'' +
                '}';
    }
}
