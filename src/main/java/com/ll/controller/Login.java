package com.ll.controller;

import com.ll.model.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    Scanner sc;
//    public static ArrayList<Member> memberList = new ArrayList<>();
//    public static ArrayList<Article> userArticles = new ArrayList<>();

    ArrayList<Member> connectedUser;
    ArrayList<Member> members;

    // 생성자
    public Login(Scanner sc, ArrayList<Member> userArticles, ArrayList<Member> connectedUser) {
        this.sc = sc;
        this.members = members;
        this.connectedUser = connectedUser;
    }

    public ArrayList<Member> login() {
        System.out.println("== 로그인 창 ==");

        while (true) {
            System.out.print("로그인 하시겠습니까? 네/아니오 )");
            String command = sc.nextLine();

            if (command.equals("아니오")) {
                break;
            }

            if (command.equals("네")) {
                System.out.print("아이디 : ");
                String userId = sc.nextLine();
                System.out.print("비밀번호 : ");
                String userPw = sc.nextLine();

                boolean loginSuccess = false;

                for (Member m : members) {
                    if (m.userId.equals(userId) && m.userPw.equals(userPw)) {
                        System.out.println(m.name + "님, 로그인 되었습니다.");
                        connectedUser.add(m);
                        loginSuccess = true;
                        break;
                    }
                }

//                if (!loginSuccess) {
                    System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
//                }
            }
        }

        return connectedUser;
    }
}