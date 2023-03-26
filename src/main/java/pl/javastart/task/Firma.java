package pl.javastart.task;

import java.util.Arrays;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;

    private Przychod[] przychody = new Przychod[10];
    private int licznikPrzychodow = 0;
    private  Wydatek[] wydatki = new Wydatek[10];
    private int licznikWydatkow = 0;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();
        double sumaWydatkow = zsumujWydatki();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.nazwaFormyOpodatkowania());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", sumaWydatkow);
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow, sumaWydatkow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double sum = 0;
        for (int i = 0; i < licznikWydatkow; i++) {
            sum += wydatki[i].getWartosc();
        }
        return sum;
    }

    private double zsumujPrzychody() {
        double sum = 0;
        for (int i = 0; i < licznikPrzychodow; i++) {
            sum += przychody[i].getWartosc();
        }
        return sum;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        ensurePrzychodyCapacity();
        przychody[licznikPrzychodow] = new Przychod(nazwa, wartosc);
        licznikPrzychodow++;
    }

    private void ensurePrzychodyCapacity() {
        if (przychody.length <= licznikPrzychodow) {
            przychody = Arrays.copyOf(przychody, przychody.length * 2);
        }
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        ensureWydatkiCapacity();
        wydatki[licznikWydatkow] = new Wydatek(nazwa, wartosc);
        licznikWydatkow++;
    }

    private void ensureWydatkiCapacity() {
        if (wydatki.length < licznikWydatkow) {
            wydatki = Arrays.copyOf(wydatki, wydatki.length * 2);
        }
    }
}
