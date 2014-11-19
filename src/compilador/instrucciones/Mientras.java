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
public class Mientras extends Nodo{
    private Expresion condicion;
    private Bloque bloque;
                
    public Mientras(ArrayList<Nodo> nodos, Expresion condicion) {
        this.bloque = new Bloque(nodos);
        this.condicion = condicion;
    }

    @Override
    public String generarCodigo() {
        return super.generarCodigo() + "while( " + condicion.valor + ")" + bloque.generarCodigo();
    }
    
    
}
