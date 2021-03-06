package com.example.asus.news.entiy;

import java.util.ArrayList;

/**
 * 新闻实体
 * Created by JiangAo on 2016/9/1.
 */
public class Article {
    int articleId;
    String title;
    String description;
    String author;
    String source;
    String content;
    String path;
    Integer columnId;
    ArrayList<Picture> pictures;
    ArrayList<Medium> media;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Article() {
        pictures = new ArrayList<Picture>();
        media = new ArrayList<Medium>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(Picture picture) {
        this.pictures.add(picture);
    }

    public ArrayList<Medium> getMedia() {
        return media;
    }

    public void setMedia(Medium medium) {
        this.media.add(medium);
    }

    public ArrayList<String> getPicPaths() {
        ArrayList<String> picPaths = new ArrayList<String>();
        for (Picture pic : pictures) {
            StringBuffer sb = new StringBuffer();
            sb.append("http://iosnews.chinadaily.com.cn/newsdata/news/")
                    .append(getPath() + "/")
                    .append(getArticleId() + "/")
                    .append(pic.getFileHD());
            picPaths.add(sb.toString());
        }
        return picPaths;
    }

    public ArrayList<String> getmediumPaths() {
        ArrayList<String> midiumPaths = new ArrayList<String>();
        for (Medium medium : media) {
            StringBuffer sb = new StringBuffer();
            sb.append("http://iosnews.chinadaily.com.cn/newsdata/news/")
                    .append(getPath() + "/")
                    .append(getArticleId() + "/")
                    .append(medium.getFileHD());
            midiumPaths.add(sb.toString());
        }
        return midiumPaths;
    }
}
