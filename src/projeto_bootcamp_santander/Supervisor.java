package projeto_bootcamp_santander;

public class Supervisor extends Aprovador {

    @Override
    public void aprovarCompra(Compra compra) {
        if (compra.getValor() <= 500) {
            System.out.println("Compra aprovada pelo Supervisor: " + compra.getDescricao());
        } else if (proximo != null) {
            proximo.aprovarCompra(compra);
        }
    }
}