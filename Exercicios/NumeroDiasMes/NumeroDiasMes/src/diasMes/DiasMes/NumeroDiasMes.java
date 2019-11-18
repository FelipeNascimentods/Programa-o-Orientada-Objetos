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
public class NumeroDiasMes {

    private byte[] mes = new byte[12];

    public NumeroDiasMes() {
        this.mes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }

    public byte getNumeroDiasMes(byte indice) {
        if (indice >= 0 && indice < 12) {
            return this.mes[indice];
        }
        return 0;
    }
}
