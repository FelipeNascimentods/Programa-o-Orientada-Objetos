package areacalculavel;

public class Retangulo implements AreaCalculavel{
    private int largura, altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double CalculaArea() {
        return this.altura * this.largura;
    }
    
    
}