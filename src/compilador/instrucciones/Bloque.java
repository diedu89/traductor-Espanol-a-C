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
public class Bloque extends Nodo{
    protected ArrayList<Nodo> nodos;
    
    public Bloque(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }

    @Override
    public String generarCodigo() {
        String codigo = super.generarCodigo() + "{";
        tabs += 1;
        
        for(Nodo nodo: nodos)
            codigo += nodo.generarCodigo();
        
        tabs -= 1;
        codigo += super.generarCodigo() + "}";
        
        return codigo;
    }
    
}
