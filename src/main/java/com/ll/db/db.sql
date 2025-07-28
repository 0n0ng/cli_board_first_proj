DROP DATABASE IF EXISTS first_proj;
CREATE DATABASE first_proj;
USE first_proj;

CREATE TABLE article (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title char(100) NOT NULL UNIQUE,
    content text, memberId INT UNSIGNED NOT NULL,
    regDate datetime NOT NULL
)

SELECT * FROM article;

CREATE TABLE MEMBER(
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    userId char(100) NOT NULL UNIQUE,
    password char(100) NOT NULL, regDate datetime NOT NULL
)

SELECT * FROM MEMBER;

