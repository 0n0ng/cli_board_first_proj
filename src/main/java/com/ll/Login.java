package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    ArrayList<UserArticle> connectedUser = new ArrayList<>();
    Scanner sc;
    ArrayList<UserArticle> userArticles = new ArrayList<>();

    Login(Scanner sc, ArrayList<UserArticle> userArticles) {
        this.sc = sc;
        this.userArticles = userArticles;
//        connectedUser = connectedUser;
    }

    public ArrayList<UserArticle> login() {
        System.out.println("== 로그인 창 ==");

        while (true) {
            System.out.print("로그인 하시겠습니까? 네/아니오 )");
            String command = sc.nextLine();

            if (command.equals("아니오")) {
                break;
            }

            for (UserArticle userArticle : userArticles) {

                if (command.equals("네")) {
                    System.out.print("아이디 : ");
                    String userId = sc.nextLine();
                    System.out.print("비밀번호 : ");
                    String userPw = sc.nextLine();
                    if (userArticle.userId.equals(userId) != userArticle.userPw.equals(userPw)) {
                        System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
                    } else if (userArticle.userId.equals(userId) && userArticle.userPw.equals(userPw)) {
                        System.out.println(userArticle.name + "님, 로그인 되었습니다.");
                        connectedUser.add(userArticle);
                    }
                }
            }
        }
        return null;
    }
}