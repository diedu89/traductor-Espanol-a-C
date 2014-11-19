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
public class SiSiNo extends Si{
    private Nodo bloque_else;
    
    public SiSiNo(Expresion condicion, ArrayList<Nodo> instruccionesSi, ArrayList<Nodo> instruccionesSiNo ) {
        super(condicion, instruccionesSi);
        this.bloque_else = new Bloque(instruccionesSiNo);
    }

    @Override
    public String generarCodigo() {
        return super.generarCodigo() + "else" + bloque_else.generarCodigo() ;
    }
    
}
