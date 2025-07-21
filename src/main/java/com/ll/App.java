package com.ll;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    Scanner sc;

    App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        int lastId = 0;

        ArrayList<Article> articles = new ArrayList<>();

        System.out.println("==게시판입니다==");
        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine();

            if (command.equals("종료")) {
                break;
            }
            if (command.equals("등록")) {
                System.out.print("제목 : ");
                String title = sc.nextLine();
                System.out.print("내용 : ");
                String content = sc.nextLine();

                lastId++;
                Article article = new Article(lastId, title, content);
                articles.add(article);
                System.out.printf("%d번 게시글이 등록되었습니다.\n", lastId);
            } else if (command.equals("목록")) {
                for (Article article : articles) {
                    System.out.printf("%d / 제목 : %s / 내용 : %s/ \n", article.id, article.title, article.content);
                }
                //startsWith : 삭제라는 말로 시작을 하냐?
            } else if (command.startsWith("삭제")) {
                // split : ?를 기준으로 2개로 쪼갠다.
                String[] commandList = command.split("\\?", 2);
                String[] paramsStr = commandList[1].split("=", 2);
                System.out.println(paramsStr[1]);

                String value = paramsStr[1];
                //Integer.parseInt(변수명) : 문자열을 숫자로 바꿔줌
                int idx = Integer.parseInt(value);
                Article article = null;

                for (Article a : articles) {
                    if (a.id == idx) {
                        article = a;
                    }
                }

                if (article == null) {
                    System.out.printf("%d번 게시글을 찾을 수 없습니다.\n", idx);
                } else {
                    articles.remove(article);
                    System.out.printf("%d번 게시글이 삭제되었습니다.\n", idx);
                }
            } else if (command.startsWith("수정")) {
                String[] commandList = command.split("\\?", 2);
                String[] paramsStr = commandList[1].split("=", 2);
                System.out.println(paramsStr[1]);

                String value = paramsStr[1];
                int idx = Integer.parseInt(value);
                Article article = null;

                for (Article a : articles) {
                    if (a.id == idx) {
                        article = a;
                    }
                }

                if (article == null) {
                    System.out.printf("%d번 게시글을 찾을 수 없습니다.\n", idx);
                } else {
                    System.out.printf("제목 (기존) : %s\n", article.title);
                    System.out.print("제목 : ");
                    String title = sc.nextLine();

                    System.out.printf("내용 (기존) : %s\n", article.content);
                    System.out.print("내용 : ");
                    String content = sc.nextLine();

                    article.title = title;
                    article.content = content;
                    System.out.printf("%d번 게시글이 수정되었습니다.\n", idx);
                }
            }

        }

    }
}

