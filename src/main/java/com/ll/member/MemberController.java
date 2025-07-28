package com.ll.member;

import com.ll.Container;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
    Scanner sc;
    //    public static ArrayList<Member> connectedUser = new ArrayList<>();
    public static ArrayList<Member> userArticles = new ArrayList<>();

    public MemberController() {
        sc = Container.getSc();
    }

    public void signup() {
        int userNum = 0;

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
                Member userArticle = new Member(userNum, name, userId, userPw);
                userArticles.add(userArticle);
                System.out.println("회원가입이 완료되었습니다.");
            } else if (command.equals("아니오")) {
                break;
            }
        }
//회원정보 저장됐나 확인용
//            else if (command.equals("목록")) {
//                for (Member userArticle : userArticles) {
//                    System.out.printf("%d번/ 이름 :%s/ 아이디 :%s/ 비밀번호 :%s \n", userArticle.userNum, userArticle.name, userArticle.userId, userArticle.userPw);
//                }
//            }
    }

    public void login() {
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

                for (Member m : userArticles) {
                    if (m.userId.equals(userId) && m.userPw.equals(userPw)) {
                        Container.setLoginedMember(m);
                        System.out.printf("%s님, 로그인 되었습니다.\n", m.name);
                        return;
                    }
                }
                System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");

            }
        }
    }
    public void logout() {
        Member loginedMember = Container.getLoginedMember();

        if (loginedMember == null) {
            System.out.println("현재 로그인된 사용자가 없습니다.");
            return;
        }
        System.out.print("로그아웃 하시겠습니까? 네/아니오 )");
        String command = sc.nextLine();

            if (command.equals("네")) {
                System.out.printf("%s 님 로그아웃 되었습니다.\n", loginedMember.name);
                Container.setLoginedMember(null);
        }
    }
}