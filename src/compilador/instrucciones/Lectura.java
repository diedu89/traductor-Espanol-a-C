/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.instrucciones;

import compilador.Ambito;
import compilador.Identificador;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Lectura extends Nodo{
    private ArrayList<Expresion> identificadores;
    
    public Lectura(ArrayList<Expresion> identificadores){
        this.identificadores = identificadores;
    }

    @Override
    public String generarCodigo() {
        String codigo = super.generarCodigo();
        String valores = "";
        codigo += "scanf(\"";
        for(Expresion expresion: identificadores){
            codigo += Expresion.getFormat(expresion.tipo);
            valores += ", " + "&" + expresion.valor;        
        }
        codigo = codigo + "\"" + 
                 valores + ");";
        return codigo;
    }
    
    
    
}
