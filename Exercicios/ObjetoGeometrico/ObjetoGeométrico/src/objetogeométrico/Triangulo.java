package objetogeométrico;
public class Triangulo extends ObjetoGeometrico{
    protected double a, b, c, s;
    
    @Override
    public String mostraDados() {
        return "fim";
    }

    @Override
    public double area() {
        perimetro();
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double perimetro() {
        s = a+b+c;
        return s;
    }
    
    // Métodos especiais
    public double getBase() {
        return a;
    }

    public void setBase(double base) {
        this.a = base;
    }

    public double getAltura() {
        return b;
    }

    public void setAltura(double altura) {
        this.b = altura;
    }

    public double getLargura() {
        return c;
    }

    public void setLargura(double largura) {
        this.c = largura;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

}
