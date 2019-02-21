public class    Main {
    public static void main(String[] args) {
        Pies pies = new Pies();
        pies.dajGlos(5);
        Kot kot = new Kot ();
        kot.dajGlos(2);
        Swinia swinia = new Swinia();
        swinia.dajGlos(3);
        KlasaC klasa = new KlasaC();
        klasa.justDoMagic();
        Dodawanie dodaj = new Dodawanie(2,2);
        dodaj.wykonajOperacje();
        System.out.println(dodaj.wykonajOperacje());
        Odejmowanie odejmij = new Odejmowanie(2,3);
        odejmij.wykonajOperacje();
        System.out.println(odejmij.wykonajOperacje());



    }
}









