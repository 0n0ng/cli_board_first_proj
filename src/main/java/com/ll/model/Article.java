package com.ll.model;
// 유저 번호, 제목, 내용 목록
public class Article {
    public int id;
    public String title;
    public String content;

    public Article(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String  getContent() {
        return content;
    }
}