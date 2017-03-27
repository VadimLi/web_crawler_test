package scrapper_sites.ranker.com;

import java.io.IOException;

public class Main {

    private static final String URL = "http://www.ranker.com/crowdranked-list/the-best-movies-of-all-time";

    public static void main(String[] args) throws IOException {

        final Parser parser = new Parser();

        parser.getTitles(URL);

    }

}
