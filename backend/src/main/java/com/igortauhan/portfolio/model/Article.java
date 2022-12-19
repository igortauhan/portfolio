package com.igortauhan.portfolio.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String tags;
    private String link;

    public Article() {}

    public Article(Long id, String title, String tags, String link) {
        this.id = id;
        this.title = title;
        this.tags = tags;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
