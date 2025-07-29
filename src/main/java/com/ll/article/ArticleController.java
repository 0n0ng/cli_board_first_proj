package com.ll.article;

import com.ll.Container;
import com.ll.Request;

import java.util.List;
import java.util.Scanner;

import com.ll.member.Member;

public class ArticleController {
    ArticleService articleService;
    Scanner sc;

    public ArticleController() {
        articleService = new ArticleService();
        sc = Container.getSc();
    }

    //등록
    public void write() {
        Member loginMember = Container.getLoginedMember();

        if (loginMember == null) {
            System.out.println("로그인 후 이용 가능합니다.");
            return;
        }
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("내용 : ");
        String content = sc.nextLine();

        int id = articleService.create(title, content);
        System.out.printf("%d번 게시글이 등록되었습니다.\n", id);
    }

    //목록
    public void list() {
        List<Article> articles = articleService.findAll();

        for (Article article : articles) {
            System.out.printf("%d / 제목 : %s / 내용 : %s/ \n", article.id, article.title, article.content);
        }
    }

    //삭제
    public void delete(Request request) {
        System.out.println("삭제 할 게시글을 입력하세요");
        System.out.println("ex)삭제?id=1 =>1번 게시글 삭제");

        int id = Integer.parseInt(request.getParams("id"));
        Article article = articleService.findById(id);

        if (article == null) {
            System.out.printf("%d번 게시글을 찾을 수 없습니다.\n", id);
        } else {
            articleService.remove(article);
            System.out.printf("%d번 게시글이 삭제되었습니다.\n", id);
        }
    }


    //수정
    public void modify(Request request) {
        int id = Integer.parseInt(request.getParams("id"));
        Article article = articleService.findById(id);

        if (article == null) {
            System.out.printf("%d번 게시글을 찾을 수 없습니다.\n", id);
        } else {
            System.out.printf("제목 (기존) : %s\n", article.title);
            System.out.print("제목 : ");
            String title = sc.nextLine();

            System.out.printf("내용 (기존) : %s\n", article.content);
            System.out.print("내용 : ");
            String content = sc.nextLine();

            article.title = title;
            article.content = content;
            System.out.printf("%d번 게시글이 수정되었습니다.\n", id);
        }
    }
}

