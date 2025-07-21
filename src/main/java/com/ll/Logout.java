package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class Logout {
    Scanner sc;
    ArrayList<UserArticle> userArticles = new ArrayList<>();

    Logout(Scanner sc, ArrayList<UserArticle> userArticles) {
        this.sc = sc;
        this.userArticles = userArticles;
    }

    public void logout() {
        System.out.print("로그아웃 하시겠습니까? 네/아니오 )");
        String command = sc.nextLine();

        for (UserArticle userArticle : userArticles) {
            if (command.equals("네")){
               if (userArticles != null){
                   System.out.println("로그아웃 되었습니다.");
               }
            }else if (command.equals("아니오")){
                continue;
            }
        }
    }
}
