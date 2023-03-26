package pl.javastart.task;

public class FormaOpodatkowania {

    public String nazwaFormyOpodatkowania() {
        return getClass().getSimpleName();
    }

    public double wyliczPodatek(double przychody, double wydatki) {
        System.out.println("Metoda z wyliczaniem podatku nie została nadpisana");
        return -1;
    }
}
