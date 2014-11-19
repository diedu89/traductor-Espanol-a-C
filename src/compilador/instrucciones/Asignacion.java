/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.instrucciones;

import compilador.Ambito;
import compilador.Identificador;

/**
 *
 * @author diego
 */
public class Asignacion extends Nodo{
    private Expresion variable, expresion;
    public Asignacion() {
        
    }
    
    public Asignacion(Expresion variable, Expresion expresion){
        this.variable = variable;
        this.expresion = expresion;
    }
    
    @Override
    public String generarCodigo(){
        return super.generarCodigo() + variable.valor + " = " + expresion.valor + ";";
    }
}
