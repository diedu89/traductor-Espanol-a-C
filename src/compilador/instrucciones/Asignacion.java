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

    public Asignacion(Ambito ambito) {
        super(ambito);
    }
    
    public Asignacion(Ambito ambito, Identificador identificador, Expresion exp){
        super(ambito);
        
    }
}
