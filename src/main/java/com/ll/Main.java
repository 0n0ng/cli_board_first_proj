package com.ll;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        // 기능별 쪼개서 (App)class만든 뒤 연결시키는 코드.
        new App(sc).run(); //게시글 남기기 옵션
        new UserService(s).createMember(); //회원가입 옵션

        sc.close();
    }
}