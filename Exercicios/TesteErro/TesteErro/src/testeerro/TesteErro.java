package testeerro;

public class TesteErro {

    public static void main(String[] args) {
        System.out.println("Inicio do MAIN");
        metodo1();
        System.out.println("Fim do MAIN");

        
    }
    static void metodo1(){
        System.out.println("Inicio do método1");
        metodo2();
    }
    
    static void metodo2(){
        System.out.println("Inicio do metodo2");
        int[] array = new int[10];
        
        try{
            for(int i = 0; i<15; i++){
                array[i] = i;
                System.out.println(i);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } 
        
        System.out.println("Fim do metodo2");
            
    }
}
