/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.banco.sistema;

/**
 *
 * @author felip
 */
public class Conta {
    private double saldo;
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public double getSaldo(){
        return saldo;
    }
}
