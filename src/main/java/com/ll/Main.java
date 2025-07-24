package com.ll;

import com.ll.controller.App;
import com.ll.controller.Login;
import com.ll.controller.Logout;
import com.ll.controller.Signup;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("원하는 기능을 입력해주세요.");
            System.out.println("회원가입, 게시판, 로그인, 로그아웃, 종료");
            System.out.print("입력) ");
            String command = sc.nextLine();

            if (command.equals("종료")) {
                break;
            }
            if (command.equals("게시판")) {
                // 아래는 기능별 쪼개서 (App)class만든 뒤 연결시키는 코드.
                new App(sc, App.articles).run(); //게시글 남기기 옵션
            } else if (command.equals("회원가입")) {
                new Signup(sc).createMember(); //회원가입 옵션
            } else if (command.equals("로그인")) {
                new Login(sc, Signup.userArticles, Signup.connectedUser).login();
            } else if (command.equals("로그아웃")) {
                new Logout(sc, Signup.connectedUser).logout();
            }
        } sc.close();
    }
}