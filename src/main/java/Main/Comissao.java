/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Thiago
 */
public class Comissao {

    String Guia;
    int pax;
    float consumo;
    float TM;
    float comissao;

    public Comissao(String Guia, int pax, float consumo) {
        this.Guia = Guia;
        this.pax = pax;
        this.consumo = consumo;
        this.TM = this.consumo / pax;
        this.comissao = consumo / 10;
    }

    public String getGuia() {
        return Guia;
    }

    public void setGuia(String Guia) {
        this.Guia = Guia;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

}



