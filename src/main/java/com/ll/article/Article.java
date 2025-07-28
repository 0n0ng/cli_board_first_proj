package com.ll.article;

import java.util.Map;

// 유저 번호, 제목, 내용 목록
public class Article {
    public int id;
    public String title;
    public String content;

    public Article(Map<String, Object> row) {
        this.id = (int) row.get("id");
        this.title = (String) row.get("title");
        this.content = (String) row.get("content");
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
    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }
}