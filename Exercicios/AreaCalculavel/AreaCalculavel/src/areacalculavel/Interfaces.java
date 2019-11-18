package areacalculavel;

public class Interfaces {

    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3, 2);
        AreaCalculavel b = new Circulo(4);
        
        System.out.println(a.CalculaArea());
        System.out.println(b.CalculaArea());
    }
    
}
