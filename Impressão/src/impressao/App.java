package impressao;

public class App {
    public static void main(String[] args) throws Exception {

        Funcionario f = new Funcionario("Mario", "111.222.444-22");
        Carro c = new Carro("Mercedes", "Preto", 2);
        Quadrado q = new Quadrado(32);

        Imprimivel i = f;
        i.imprimir();

        i = c;
        i.imprimir();

        i = q;
        i.imprimir();

    }
}
