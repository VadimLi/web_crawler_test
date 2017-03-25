package scrapper_sites.imdb.com;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Scraper {

    public static void main(String[] args) throws IOException {

        MyClass myClass = new MyClass();

        myClass.getPageLinks("http://www.imdb.com/chart/top");


    }

}
