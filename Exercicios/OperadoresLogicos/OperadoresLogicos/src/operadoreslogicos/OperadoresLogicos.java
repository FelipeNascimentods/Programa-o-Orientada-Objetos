package operadoreslogicos;


public class OperadoresLogicos {


    public static void main(String[] args) {
        int x, y, z;
        boolean res;
        x = 4;
        y = 7;
        z = 12;
        res = (x<y ^ y<z)?true:false;
        System.out.println(res);
    }
    
}
