package scrapper_sites.imdb.com;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {

    private ArrayList<String> links;

    private List<String> articles;

    private Elements linksOnMainPage;

    private String titleFilm;

    private int index;

    public MyClass() {
        articles = new ArrayList<>();
        links = new ArrayList<>();

        index++;
    }

    public void getPageLinks(final String URL) {

        System.out.println();

        try {
            links.add(URL);

            System.setProperty("http.proxyhost", "127.0.0.1");
            System.setProperty("http.proxyport", "3128");

            Document document = Jsoup.connect(URL)
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0")
                    .ignoreContentType(true)
                    .timeout(10000)
                    .method(Connection.Method.GET)
                    .get();

            linksOnMainPage = document.select(".titleColumn a");

            titleFilm = document.select(".originalTitle").text();
            articles.add(titleFilm);

            if (index > 1)
                System.out.println( (index-1) + ")" + titleFilm);

            for (final Element page : linksOnMainPage) {
                index++;
                getPageLinks(page.attr("abs:href"));
            }

        } catch (IOException e) {
            System.err.println("For '" + URL + "': " + e.getMessage());
        }

    }

    public static String test(String testString){
        final Pattern p = Pattern.compile("[a-z&&[^(-)]]");
        final Matcher m = p.matcher(testString);
        return String.valueOf(m);
    }

}
