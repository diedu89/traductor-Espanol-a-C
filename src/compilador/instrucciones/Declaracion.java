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
public class Declaracion extends Nodo{
    private String tipo;
    private ArrayList<String> identificadores;
    
    public Declaracion(Ambito ambito, String tipo, ArrayList<String> identificadores){
        super(ambito);
        this.tipo = tipo;
        this.identificadores = identificadores;
    }
    
    public Declaracion(Ambito ambito, String tipo, String variable){
        this(ambito, tipo, new ArrayList<String>());
        this.identificadores.add(variable);
    }
}