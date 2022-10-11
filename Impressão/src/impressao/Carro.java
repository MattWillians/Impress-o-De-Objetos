package impressao;

public class Carro implements Imprimivel{

    public Carro(String marca, String cor, int portas) {
        this.marca = marca;
        this.cor = cor;
        this.portas = portas;
    }

    String marca;
    String cor;
    int portas;
    
    @Override
    public void imprimir() {
        System.out.println("Marca carro: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Portas: " + portas);        
    }
    
}
