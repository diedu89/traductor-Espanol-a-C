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
public class ExpresionAritmetica extends Expresion{
    
    public ExpresionAritmetica(Expresion op1, String operador, Expresion op2) throws SemanticException {
        super("","");
        if(!(op1.tipo.equals("FLOTANTE") || op1.tipo.equals("ENTERO")))
            throw new SemanticException("El operador " + operador + " no puede aplicarse a un tipo " + op1.tipo );
        if(!(op2.tipo.equals("FLOTANTE") || op2.tipo.equals("ENTERO")))
            throw new SemanticException("El operador " + operador + " no puede aplicarse a un tipo " + op2.tipo );
        
        this.valor = op1.valor + " " + operador + " " + op2.valor;
        this.tipo = (op1.tipo.equals("FLOTANTE") || op2.tipo.equals("FLOTANTE")) ? "FLOTANTE" : "ENTERO";
    }
    
}
