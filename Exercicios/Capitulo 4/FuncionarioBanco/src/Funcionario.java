/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Funcionario {
    String nome, departamento, rg;
    double salario;
    boolean ativo;
    Data data = new Data();
    
    void bonifica(double aumento){
        double salarioNovo = this.salario + aumento;
        this.salario = salarioNovo;
    }
    
    void demite(){
        ativo = false;
    }
    
    void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("RG: " + this.rg);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("Dia: " + this.data.dia);
        System.out.println("Dia: " + this.data.mes);
        System.out.println("Dia: " + this.data.ano);
        if(ativo==true){
            System.out.println("Ativo");
        }else{
            System.out.println("Não Ativo");
        }
    }
    
}
