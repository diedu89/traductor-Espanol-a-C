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
public class Si extends Nodo {
    private final Bloque bloque;
    private final Expresion condicion;
    
    public Si(Expresion condicion, ArrayList<Nodo> instrucciones){
        this.bloque = new Bloque(instrucciones);
        this.condicion = condicion;
    }
    
    @Override
    public String generarCodigo(){
        String codigo = super.generarCodigo();
        codigo += "if( " + condicion.valor + " )";
        codigo += bloque.generarCodigo();
        return codigo;
    }
}
