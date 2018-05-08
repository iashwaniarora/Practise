import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Ashwani on 5/11/2016.
 */
public class TestMain {


    private static  List<Article> articles;

    public static void populateArticleList()
    {
        articles = new LinkedList<Article>();
        LinkedList tags = new LinkedList();
        tags.add("java");
        Article article = new Article("FirstTitle","FirstAuthor",tags);
        articles.add(article);


    }


    public Article getFirstJavaArticle()
    {
        for(Article article :articles)
        {
            if(article.getTags().contains("java"))
            {
                return article;
            }

        }
        return null;

    }

    public static void main(String[] args) {
        populateArticleList();
        TestMain testMain = new TestMain();
        System.out.println("TestMain.main"+testMain.getFirstJavaArticle().getAuthor());

    }


    public Optional<Article> getFirstJavaArticleUsingJava8()
    {
        return articles.stream().filter(article -> article.getTags().contains("java")).findFirst();
    }
}
