package objetogeométrico;

import static java.lang.Math.PI;

public class Circulo extends ObjetoGeometrico{
    private double x, y, raio;

    @Override
    public String mostraDados() {
        return "fim";
    }

    @Override
    public double area() {
        return Math.PI*(raio*raio);
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*raio;
    }
    
    // Métodos especiais
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    

}
