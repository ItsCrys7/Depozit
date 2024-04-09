public class ProdusNecompensat extends Produs {
    public ProdusNecompensat(String cod, String nume, double pretDeBaza, int cantitate) {
        super(cod, nume, pretDeBaza, cantitate);
    }

    @Override
    double calculeazaPret() {
        return pretDeBaza;
    }
}
