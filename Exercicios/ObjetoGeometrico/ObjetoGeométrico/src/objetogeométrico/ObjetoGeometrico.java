package objetogeométrico;
public abstract class ObjetoGeometrico {
    protected double area, perimetro;
    
    public abstract String mostraDados();
    
    public abstract double area();
    
    public abstract double perimetro();

    // Métodos especiais
    public ObjetoGeometrico() {
        this.area = 0;
        this.perimetro = 0;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
}
