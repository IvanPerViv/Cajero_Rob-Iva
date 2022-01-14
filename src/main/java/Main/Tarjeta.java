/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Date;

/**
 *
 * @author rober
 */
public class Tarjeta {
    String numero_tarjeta;
    String CVS;
    String fecha_cad;

    public Tarjeta (String numTarjeta, String cvs, String fechaCad){
        numero_tarjeta = numTarjeta;
        CVS = cvs;
        fecha_cad = fechaCad;
    }

    public void setCVS(String CVS) {
        this.CVS = CVS;
    }

    public void setFecha_cad(String fecha_cad) {
        this.fecha_cad = fecha_cad;
    }

    public String getCVS() {
        return CVS;
    }

    public String getFecha_cad() {
        return fecha_cad;
    }
}
