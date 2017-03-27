package scrapper_sites.empireonline.com;

import java.io.IOException;

public class Main {

    private static final String URL = "http://www.empireonline.com/movies/features/500-greatest-movies/";

    public static void main(String[] args) throws IOException {

        final Parser parser = new Parser();

        parser.getTitles(URL);

    }

}
