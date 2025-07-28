package com.ll.member;

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

    public int getUserNum() {
        return userNum;
    }
    public String getName() {
        return name;
    }
    public String  getUserId() {
        return userId;
    }
    public String  getUserPw() {
        return userPw;
    }

}
