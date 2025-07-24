package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class Logout {
    UserArticle connectedUser;
    Scanner sc;

    Logout(Scanner sc, ArrayList<UserArticle> connectedUser) {
        this.sc = sc;
//        this.connectedUser = connectedUser;
    }

    public void logout() {
        if (UserService.connectedUser == null) {
            System.out.println("현재 로그인된 사용자가 없습니다.");
            return;
        }

        System.out.print("로그아웃 하시겠습니까? 네/아니오 )");
        String command = sc.nextLine();

        while (true) {
            if (command.equals("아니오")) {
                break;
            } else if (command.equals("네")) {
                System.out.printf("%s 님 로그아웃 되었습니다.\n", connectedUser.name);
                connectedUser = null;
            }
        }
    }
}