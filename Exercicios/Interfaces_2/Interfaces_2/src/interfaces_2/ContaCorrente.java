package interfaces_2;

public class ContaCorrente implements Tributavel{
    // Atributos
    private double saldo;
    
    // Métodos públicos
    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
    
    public void deposita(double valor){
        if (valor > 0){
            this.setSaldo(this.getSaldo()+ valor);
        }
    }
    
    // Métodos especiais

    public ContaCorrente() {
    
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    
}
