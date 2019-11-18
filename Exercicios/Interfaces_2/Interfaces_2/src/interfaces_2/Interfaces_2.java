package interfaces_2;

public class Interfaces_2 {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        
        System.out.println(cc.calculaTributos());

        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        
        
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        SeguroDeVida sv = new SeguroDeVida();
        ContaCorrente c = new ContaCorrente();
        c.deposita(1000);
        
        gerenciador.adiciona(c);
        
        System.out.println(gerenciador.getTotal());
        
        System.out.printf("O saldo é: R$ %.2f\n", c.getSaldo());
    }
    
}
