package com.ll;

import com.ll.article.ArticleController;
import com.ll.db.DBConnection;
import com.ll.member.MemberController;

import java.util.Scanner;

public class App {
    ArticleController articleController;
    MemberController memberController;
    Scanner sc;
//    SystemController systemController;

    App() {
        DBConnection.DB_NAME = "first_proj";
        DBConnection.DB_PORT = 3306;
        DBConnection.DB_USER = "root";
        DBConnection.DB_PASSWORD = "";

        Container.getDBConnection().connect();

        sc= Container.getSc();
        articleController = new ArticleController();
        memberController = new MemberController();
    }

    public void run() {
        System.out.println("== 원하는 기능을 입력하세요 ==");
        System.out.println("회원가입, 로그인, 로그아웃");
        System.out.println("등록, 목록, 삭제, 수정, 종료");
        while (true) {
            System.out.print("입력) ");
            String command = sc.nextLine();
            Request request = new Request(command);

            switch (command) {
                case "종료":
                    return;
                case "등록":
                    articleController.write();
                    break;
                case "목록":
                    articleController.list();
                    break;
                case "삭제":
                    articleController.delete(request);
                    break;
                case "수정":
                    articleController.modify(request);
                    break;
                case "회원가입":
                    memberController.signup();
                    break;
                case "로그인":
                    memberController.login();
                    break;
                case "로그아웃":
                    memberController.logout();
                    break;
                default:
                    System.out.println("존재하지 않는 명령어입니다.");
                    break;
            }
        }
    }
}


