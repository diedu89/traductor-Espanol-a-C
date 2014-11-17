/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.instrucciones;

import compilador.Ambito;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Despliegue extends Nodo{
    ArrayList<Expresion> expresiones;
    
    public Despliegue(Ambito ambito, ArrayList<Expresion> expresiones){
        super(ambito);
        this.expresiones = expresiones;
    }
}
