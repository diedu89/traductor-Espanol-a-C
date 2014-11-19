/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java_cup.runtime.Symbol;

/**
 *
 * @author diego
 */
public class SemanticException extends Exception{
    public Symbol token;
    public SemanticException(String mensaje, Symbol currentSymbol){
        super(mensaje);
        token = currentSymbol;
    }
}
