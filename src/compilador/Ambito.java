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
        this.tablaSimbolos = new HashMap();
    }
    
    public void put(String id, Identificador value){
        tablaSimbolos.put(id, value);
    }
    
    public Identificador get(String id, Boolean propagar){
        Ambito ambito = this;
        while(ambito != null){
            if(tablaSimbolos.get(id) != null) return tablaSimbolos.get(id);
            if(propagar) ambito = ambito.padre;
            else return null;
        }
        return null;
    }
    
}
