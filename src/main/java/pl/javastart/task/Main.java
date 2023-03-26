package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new NaCzarno());

        firma.dodajPrzychod("Remont Mieszkania", 20_000);
        firma.dodajWydatek("Gładzie i farby", 1_000);

        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new PodatekWedlugSkali());

        janNowakServices.dodajPrzychod("Programowanie", 150_000);
        janNowakServices.dodajWydatek("Energetyki", 20_000);

        janNowakServices.wyswietlPodsumowanie();
    }

}
