/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.instrucciones;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Desde extends Nodo{
    private int desde, hasta;
    private String identificador;
    private Bloque bloque;
    
    public Desde(ArrayList<Nodo> nodos, String identificador, int desde, int hasta) {
        this.bloque = new Bloque(nodos);
        this.identificador = identificador;
        this.desde = desde;
        this.hasta = hasta;
    }

    @Override
    public String generarCodigo() {
        return  super.generarCodigo() + "for( int " + 
                identificador + " = " + desde + "; " +
                identificador + " <= " + hasta + ";" +
                identificador + "++)" + bloque.generarCodigo();
    }
    
    
}
