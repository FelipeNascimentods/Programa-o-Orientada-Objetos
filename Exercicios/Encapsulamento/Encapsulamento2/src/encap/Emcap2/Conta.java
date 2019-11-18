package encap.Emcap2;

/**
 *
 * @author felip
 */
public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    
    public int getNumero(){
        return this.numero;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public double getLimite(){
        return this.limite;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
}
    