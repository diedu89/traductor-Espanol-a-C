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
    
    public Despliegue(ArrayList<Expresion> expresiones){
        this.expresiones = expresiones;
    }
    
    @Override
    public String generarCodigo() {
        String codigo = super.generarCodigo();
        String valores = "";
        codigo += "printf(\"";
        for(Expresion expresion: expresiones){
            codigo += Expresion.getFormat(expresion.tipo) + " ";
            valores += "," + expresion.valor;        
        }
        codigo = codigo.substring(0, codigo.length()) + "\\n\"" + 
                 valores + ");";
        return codigo;
    }
    
    
}
