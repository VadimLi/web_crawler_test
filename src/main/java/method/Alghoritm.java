package method;

public class Alghoritm {

    private static final double SIGMA = 1.0;

    private static double likeliHood(double x, double mu) {
        return Math.exp( - Math.pow(x - mu, 2) / 2 * Math.pow(SIGMA, 2));
    }

    public static void getRatingFilm() {
        
    }

}
