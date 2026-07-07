package projeto_bootcamp_santander;

public class Main {
    public static void main(String[] args) {

        Aprovador atendente = new Atendente();
        Aprovador supervisor = new Supervisor();
        Aprovador gerente = new Gerente();
        Aprovador diretoria = new Diretoria();

        atendente.setProximo(supervisor);
        supervisor.setProximo(gerente);
        gerente.setProximo(diretoria);

        Compra compra1 = new Compra("Mouse", 80);
        Compra compra2 = new Compra("Teclado mecânico", 300);
        Compra compra3 = new Compra("Monitor", 900);
        Compra compra4 = new Compra("Notebook", 3500);

        atendente.aprovarCompra(compra1);
        atendente.aprovarCompra(compra2);
        atendente.aprovarCompra(compra3);
        atendente.aprovarCompra(compra4);
    }
}