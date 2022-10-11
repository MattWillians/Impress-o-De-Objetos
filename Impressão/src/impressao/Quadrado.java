package impressao;
public class Quadrado implements Imprimivel{
    
    public Quadrado(int tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    int tamanhoLado;

    @Override
    public void imprimir() {
        System.out.println("Tamanho: " + tamanhoLado);
        
    }

}
