package scrapper_sites.rottentomatoes.com;

import java.io.IOException;

public class Main {

    private static final String URL = "https://www.rottentomatoes.com/top/bestofrt/";

    public static void main(String[] args) throws IOException {

        final Parser parser = new Parser();

        parser.getTitles(URL);

    }

}
