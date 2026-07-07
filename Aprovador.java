package projeto_bootcamp_santander;

public abstract class Aprovador {
	
    protected Aprovador proximo;

    public void setProximo(Aprovador proximo) {
        this.proximo = proximo;
    }

    public abstract void aprovarCompra(Compra compra);
}