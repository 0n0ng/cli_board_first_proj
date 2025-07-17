package com.ll;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==게시판입니다==");

        while (true) {

            System.out.print("명령) ");
            String command = sc.nextLine();


            if (command.equals("등록")) {
                System.out.print("제목 : ");
                command = sc.nextLine();
                System.out.print("내용 : ");
                command = sc.nextLine();
            }

            System.out.print("종료");
            command = sc.nextLine();

            break;
        }
        sc.close();
    }
}


