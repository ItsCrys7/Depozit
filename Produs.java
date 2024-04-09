public abstract class Produs {
    protected String cod;
    protected String nume;
    protected double pretDeBaza;
    protected int cantitate;

    public Produs(String cod, String nume, double pretDeBaza, int cantitate) {
        this.cod = cod;
        this.nume = nume;
        this.pretDeBaza = pretDeBaza;
        this.cantitate = cantitate;
    }

    public abstract double calculeazaPret();
}
