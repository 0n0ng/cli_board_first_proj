package com.ll;
// 유저 번호, 제목, 내용 목록
public class Article {
    int id;
    String title;
    String content;

    Article(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}