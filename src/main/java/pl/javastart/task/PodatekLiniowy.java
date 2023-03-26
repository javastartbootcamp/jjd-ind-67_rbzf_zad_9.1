package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return (przychody - wydatki) * 0.19;
    }
}
