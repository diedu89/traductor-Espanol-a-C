/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

/**
 *
 * @author diego
 */
public class SemanticException extends Exception{
    public SemanticException(String mensaje){
        super(mensaje);
    }
}