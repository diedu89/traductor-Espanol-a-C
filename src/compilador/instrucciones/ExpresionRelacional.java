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
public class ExpresionRelacional extends Expresion{
    
    public ExpresionRelacional(Expresion op1, String operador, Expresion op2) throws SemanticException{
        super("","");
        if(op1.tipo.equals("CADENA") || op2.tipo.equals("CADENA"))
            throw new SemanticException("El operador " + operador + " no puede aplicarse a un tipo de dato CADENA" );
        if(
            (op1.tipo.equals("BOOLEANO") && !op2.tipo.equals("BOOLEANO")) || 
            (!op1.tipo.equals("BOOLEANO") && op2.tipo.equals("BOOLEANO"))
          )
            throw new SemanticException("No se puede comparar un tipo de dato " + op1.tipo + " y tipo de dato " + op2.tipo );
        
        this.valor = op1.valor + " " + operador + " " + op2.valor;
        this.tipo = "BOOLEANO";
    }
}
