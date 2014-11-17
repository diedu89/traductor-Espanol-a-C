/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compilador;

import java.util.HashMap;

/**
 *
 * @author diego
 */
public class Ambito {
    public Ambito padre;
    private HashMap<String, Identificador> tablaSimbolos;
    
    public Ambito(Ambito padre){
        this.padre = padre;
        tablaSimbolos = new HashMap();
    }
    
    public void put(String id, Identificador value){
        tablaSimbolos.put(id, value);
    }
    
    public Identificador get(String id){
        Ambito ambito = this;
        while(ambito != null){
            if(ambito.get(id) != null) return ambito.get(id);
            ambito = ambito.padre;
        }
        return null;
    }
    
}
