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
public class Nodo {
    private ArrayList<Nodo> nodos;
    private Ambito ambito;
    
    public Nodo(Ambito ambito){
        this.nodos = new ArrayList<Nodo>();
        this.ambito = ambito;
    }
    
    public Nodo(Ambito ambito, Nodo nodo){
        this(ambito);
        this.nodos.add(nodo);
    }
    
    public Nodo(Ambito ambito, ArrayList<Nodo> nodos){
        this.ambito = ambito;
        this.nodos = nodos;
    }

}
