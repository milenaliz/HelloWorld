public class Osoba {
   private String imie;
    private String nazwisko;
    private int wiekWDniach;

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiekWDniach=" + wiekWDniach +
                '}';
    }
    public int toWeeks(){
        return wiekWDniach*7;
    }

}
