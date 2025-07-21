package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

// 회원가입에 필요한 것들.
// userName, userId, userPw -> userRepository 내에 저장
public class UserService {
    Scanner sc;

    UserService(Scanner sc) {
        this.sc = sc;
    }

    public void createMember() {
        int userNum = 0;

        ArrayList<UserArticle> userArticles = new ArrayList<>();

        System.out.println("=== 회원가입 ===");

        while (true) {
            System.out.print("회원가입 하시겠습니까? 네/아니오 )");
            String command = sc.nextLine();

            if (command.equals(("네"))) {
                System.out.print("회원님의 이름을 입력해주세요.");
                String name = sc.nextLine();
                System.out.print("사용하실 아이디를 입력해주세요.");
                String userId = sc.nextLine();
                System.out.print("사용하실 비밀번호를 입력해주세요.");
                String userPw = sc.nextLine();

                userNum++;
                UserArticle userArticle = new UserArticle(userNum, name, userId, userPw);
                userArticles.add(userArticle);
                System.out.println("회원가입이 완료되었습니다.");
            } else if (command.equals("아니오")){
                break;
            }
//회원정보 저장됐나 확인용
//            else if (command.equals("목록")) {
//                for (UserArticle userArticle : userArticles) {
//                    System.out.printf("%d번/ 이름 :%s/ 아이디 :%s/ 비밀번호 :%s \n", userArticle.userNum, userArticle.name, userArticle.userId, userArticle.userPw);
//                }
//            }
        }
    }
}
