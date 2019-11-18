/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encap.Emcap2;

/**
 *
 * @author felip
 */
public class Teste {
    public static void main(String[] args) {
        Conta nova;
        nova = new Conta();
        
        nova.setNumero(102030);
        nova.setSaldo(1500.21);
        nova.setLimite(2000);
        
        System.out.println("Numero: "+nova.getNumero());
        System.out.println("Saldo: "+nova.getSaldo());
        System.out.println("Limite: "+nova.getLimite());
    }
}
