package scrapper_sites.businessinsider.com;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    private List<String> articles;

    public Parser() {
        articles = new ArrayList<>();
    }

    public void getTitles(final String URL) throws IOException {

        System.setProperty("http.proxyhost", "127.0.0.1");
        System.setProperty("http.proxyport", "3128");

        final Document document = Jsoup.connect(URL)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0")
                .ignoreContentType(true)
                .timeout(10000)
                .method(Connection.Method.GET)
                .get();

        final Elements titleFilms = document.select(".slide-title");


        //.slide-title , p
        int i = 0;
        for (final Element filmArticle : titleFilms) {
            i++;
            System.out.println(i + " ) " + filmArticle.text());
        }

        final Elements ratingFilms = document.select(".clear-both p");

        i = 0;

        for (final Element filmRating : ratingFilms) {
            i++;
            System.out.println(i + " ) " + filmRating.text());
        }

    }

}
