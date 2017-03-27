package scrapper_sites.listchallenges.com;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final Parser parser = new Parser();
        parser.getTitles("http://www.listchallenges.com/reddit-top-250-movies");
    }

}
