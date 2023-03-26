package pl.javastart.task;

public class Przychod {
    private String name;
    private double wartosc;

    public Przychod(String name, double wartosc) {
        this.name = name;
        this.wartosc = wartosc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }
}
