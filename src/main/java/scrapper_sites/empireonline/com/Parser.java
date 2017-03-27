package scrapper_sites.empireonline.com;

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

        final Elements titleFilms = document.select(".article__text h2");

        for (final Element film : titleFilms) {
            System.out.println(film.text());
            articles.add(film.text());
        }

    }

}
