package pl.javastart.task;

public class PodatekWedlugSkali extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochody = przychody - wydatki;
        if (dochody < 10_000) {
            return 0;
        } else if (dochody < 100_000) {
            return (dochody - 10_000) * 0.18;
        } else {
            return 90_000 * 0.18 + (dochody - 100_000) * 0.32;
        }
    }
}
