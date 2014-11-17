/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.instrucciones;

import compilador.SemanticException;
import compilador.instrucciones.Expresion;

/**
 *
 * @author diego
 */
public class ExpresionCondicional extends Expresion{

    public ExpresionCondicional(Expresion op1, String operador, Expresion op2) throws SemanticException {
        super("","");
        if( !(op1.tipo.equals("BOOLEANO") && op2.tipo.equals("BOOLEANO")) )
            throw new SemanticException("El operador " + operador + " no puede aplicarse a un tipo de dato CADENA" );
        
        this.valor = op1.valor + " " + operador + " " + op2.valor;
        this.tipo = "BOOLEANO";
    }
    
}
