package com.ll.model;

public class Member {
    public int userNum;
    public String name;
    public String userId;
    public String userPw;

    public Member(int userNum, String name, String userId, String userPw){
        this.userNum = userNum;
        this.name = name;
        this.userId = userId;
        this.userPw = userPw;
    }

}