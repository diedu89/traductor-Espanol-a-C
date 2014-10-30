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
public class Booleano extends Token{

    public Booleano(int line, int column) {
        super(sym.CADENA, line, column);
    }
    
}
