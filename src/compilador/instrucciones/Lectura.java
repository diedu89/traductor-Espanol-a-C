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
public class Lectura extends Nodo{
    private ArrayList<String> identificadores;
    
    public Lectura(Ambito ambito) {
        super(ambito);
        this.identificadores = new ArrayList<String>();
    }
    
    public Lectura(Ambito ambito,ArrayList<String> identificadores){
        super(ambito);
        this.identificadores = identificadores;
    }
    
}
