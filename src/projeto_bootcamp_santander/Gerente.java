package projeto_bootcamp_santander;

public class Gerente extends Aprovador {

    @Override
    public void aprovarCompra(Compra compra) {
        if (compra.getValor() <= 1000) {
            System.out.println("Compra aprovada pelo Gerente: " + compra.getDescricao());
        } else if (proximo != null) {
            proximo.aprovarCompra(compra);
        }
    }
}