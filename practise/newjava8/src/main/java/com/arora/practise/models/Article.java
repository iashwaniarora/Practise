package com.arora.practise.models;

import java.util.List;

/**
 * Created by ashwani on 2/26/17.
 */
public class Article {
    private final String title;
    private final String author;
    private final List<String> tags;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTags() {
        return tags;
    }

    private Article(String title, String author, List<String> tags) {
        this.title = title;
        this.author = author;
        this.tags = tags;
    }


}
