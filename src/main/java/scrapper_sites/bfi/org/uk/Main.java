package scrapper_sites.bfi.org.uk;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final Parser parser = new Parser();
        parser.getTitles("http://www.bfi.org.uk/news/50-greatest-films-all-time");
    }


}
