public class ProdusCompensat extends Produs {
    double coeficient;

    public ProdusCompensat(String cod, String nume, double pretDeBaza, int cantitate, double coeficient) {
        super(cod, nume, pretDeBaza, cantitate);
        this.coeficient = coeficient;
    }

    @Override
    double calculeazaPret() {
        return pretDeBaza * coeficient;
    }
}
