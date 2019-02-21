public enum DniTygodnia {

    PONIEDZIALEK(2,"PON", "MON"),
    WTOREK(3, "WT", "TUE"),
    SRODA(4, "SR", "WED"),
    CZWARTEK(5, "CZW", "WED"),
    PIATEK(6, "PIAT", "FRI"),
    SOBOTA(7, "SOB", "SAT"),
    NIEDZIELA(1, "NIE", "SUN");

    private int id;
    private int dzienTygodnia;
    private String skrot;
    private String tlumacz;

    DniTygodnia(int kolejnosc, String skrot, String tlumacz){
        this.dzienTygodnia = kolejnosc;
        this.skrot = skrot;
        this.tlumacz = tlumacz;
    }
public int dajDzienTygodnia (){
        return dzienTygodnia;
}
public String dajSkrot(){
        return skrot;}
        public String tlumacz (){
        return tlumacz;
        }

            }


