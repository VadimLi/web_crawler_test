package scrapper_sites.businessinsider.com;


import java.io.IOException;

public class Main {

    private static final String URL = "http://www.businessinsider.com/50-best-movies-all-time-critics-2016-10/#50-star-wars-episode-iv-a-new-hope-1977-1";

    public static void main(String[] args) throws IOException {

        final Parser parser = new Parser();

        parser.getTitles(URL);

    }

}
