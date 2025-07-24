package com.ll.service;

import com.ll.model.Article;

import java.util.ArrayList;

public class ArticleService {
    private ArrayList<Article> articles;
    private int lastId;

    public ArticleService(ArrayList<Article> articles) {
        this.articles = articles;
        this.lastId = articles.size(); // 기존 게시글 수 기반
    }

    public Article write(String title, String content) {
        lastId++;
        Article article = new Article(lastId, title, content);
        articles.add(article);
        return article;
    }

    public ArrayList<Article> findAll() {
        return articles;
    }

    public Article findById(int id) {
        for (Article a : articles) {
            if (a.id == id) return a;
        }
        return null;
    }

    public boolean delete(Article article) {
        return articles.remove(article);
    }
}