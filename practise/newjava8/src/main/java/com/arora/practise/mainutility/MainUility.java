package com.arora.practise.mainutility;

import com.arora.practise.models.Article;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ashwani on 2/26/17.
 */
public class MainUility {

    private List<Article> articles = new LinkedList<Article>();

    public static void main(String[] args) {


    }


    public Article getFirstJavaArticle() {
        for (Article article : articles) {
            if (article.getTags().contains("Java")) {
                return article;
            }

        }
        return null;
    }


    public Optional<Article> getFirstJavaArticleJava8() {
        return articles.stream().filter(article -> article.getTags().contains("Java")).findFirst();
    }

    public List<Article> getAllJavaArticles() {
        List<Article> resultArticles = new LinkedList<>();

        for (Article article : articles) {
            if (article.getTags().contains("Java")) {
                resultArticles.add(article);
            }
        }
        return resultArticles;
    }

    public List<Article> getAllJavaArticlesJava8() {
        return articles.stream().filter(article -> article.getTags().contains("Java")).collect(Collectors.toList());
    }

    public Map<String, List<Article>> groupByAuthor() {
        Map<String,List<Article>> stringListMap =  new HashMap<>();
        for (Article article : articles) {
            if(stringListMap.containsKey(article.getAuthor()))
            {
                stringListMap.get(article.getAuthor()).add(article);
            }
            else
            {
                List<Article> articlesList = new LinkedList<>();
                articlesList.add(article);
                stringListMap.put(article.getAuthor(),articlesList);
            }

        }
        return  stringListMap;
    }


    public Map<String,List<Article>> groupArticlesByAuthorJava8()
    {
        return articles.stream().collect(Collectors.groupingBy(Article::getAuthor));
    }
}
