public class Odejmowanie extends Operacja {
    private double liczba1;
    private double liczba2;

    public Odejmowanie(double licz1, double licz2) {
        liczba1 = licz1;
        liczba2 = licz2;
    }

    public double wykonajOperacje() {
        return liczba1 - liczba2;
    }
}
