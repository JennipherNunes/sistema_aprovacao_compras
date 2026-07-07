package projeto_bootcamp_santander;

public class Atendente extends Aprovador {

    @Override
    public void aprovarCompra(Compra compra) {
        if (compra.getValor() <= 100) {
            System.out.println("Compra aprovada pelo Atendente: " + compra.getDescricao());
        } else if (proximo != null) {
            proximo.aprovarCompra(compra);
        }
    }
}