/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.instrucciones;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Funcion extends Nodo{
    private Bloque bloque;
    private String nombre;
    private String tipo;
    private ArrayList<Expresion> argumentos;
    
    public Funcion(String nombre, Bloque bloque, String tipo){
        this.nombre = nombre;
        this.bloque = bloque;
        this.tipo = tipo;
        this.argumentos = null;
    }

    public Funcion(String nombre, Bloque bloque, String tipo, ArrayList<Expresion> argumentos){
        this(nombre,bloque,tipo);
        this.argumentos = argumentos;
    }
    
    @Override
    public String generarCodigo() {
        return super.generarCodigo() + Expresion.getTipo(tipo) + " " + nombre + 
                "(" + ((argumentos != null)?generarArgumentos():"") + ")" + 
                bloque.generarCodigo();
    }
    
    private String generarArgumentos(){
        String codigo="";
        for(Expresion expresion: argumentos)
            codigo += " " + Expresion.getTipo(expresion.tipo) + " " + expresion.valor + ",";
        
        return codigo.substring(0, codigo.length() - 1);
    }
    
}
