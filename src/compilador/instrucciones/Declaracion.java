/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.instrucciones;

import compilador.Ambito;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class Declaracion extends Nodo{
    private String tipo;
    private ArrayList<String> identificadores;
    
    public Declaracion(String tipo, ArrayList<String> identificadores){
        this.tipo = tipo;
        this.identificadores = identificadores;
    }
    
    public Declaracion( String tipo, String variable){
        this(tipo, new ArrayList<String>());
        this.identificadores.add(variable);
    }
    
    @Override
    public String generarCodigo(){
        String codigo = super.generarCodigo() + Expresion.getTipo(tipo);
        for(String id: identificadores)
            codigo += " " + id + ",";
        return codigo.substring(0, codigo.length() - 1) + ";";
    }
}