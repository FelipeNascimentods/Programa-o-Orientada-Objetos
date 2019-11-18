/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encp.Emcapsulamento;

/**
 *
 * @author felip
 */
public class Funcionario {
    private double salario;
    private String nome;
    
    public String getNome(){
        return this.nome;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
}
