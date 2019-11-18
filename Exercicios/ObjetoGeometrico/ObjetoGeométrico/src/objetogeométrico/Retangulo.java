package objetogeométrico;
public class Retangulo extends ObjetoGeometrico{
    protected double altura, largura;
    
    @Override
    public String mostraDados() {
        return "fim";
    }

    @Override
    public double area() {
        return altura*largura;
    }

    @Override
    public double perimetro() {
        return 2*largura+2*altura;
    }
    
    // Métodos especiais
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}