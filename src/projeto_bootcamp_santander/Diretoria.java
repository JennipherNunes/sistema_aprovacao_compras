package projeto_bootcamp_santander;

public class Diretoria extends Aprovador {

    @Override
    public void aprovarCompra(Compra compra) {
        System.out.println("Compra encaminhada para aprovação da Diretoria: "
                + compra.getDescricao());
    }
}