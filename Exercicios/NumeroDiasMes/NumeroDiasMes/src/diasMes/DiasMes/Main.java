/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasMes.DiasMes;

/**
 *
 * @author felip
 */
public class Main {

    public static void main(String[] args) {
        NumeroDiasMes nMes = new NumeroDiasMes();

        byte num = nMes.getNumeroDiasMes(11);

        System.out.println("Dezembro possui " + num + " dias.");
    }
}

