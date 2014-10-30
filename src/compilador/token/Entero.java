/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compilador.token;

import compilador.sym;

/**
 *
 * @author diego
 */
public class Entero extends Token{

    public Entero(int line, int column, String value) {
        super(sym.ENTERO, line, column);   
    }
    
}
