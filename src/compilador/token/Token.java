/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compilador.token;

/**
 *
 * @author diego
 */
public class Token {       
    protected int line, column, etiqueta;
    
    public Token(int etiqueta, int line, int column){
        this.etiqueta = etiqueta;
        this.line = line;
        this.column = column;
    }
}