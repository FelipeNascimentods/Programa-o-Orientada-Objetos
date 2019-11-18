/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.banco.testes;

import br.com.k19.banco.sistema.Conta;

public class Testes {
    public static void main(String[] args) {
      Conta c = new Conta();
      
      c.deposita(1000);
        System.out.println(c.getSaldo());
    }
  
}
