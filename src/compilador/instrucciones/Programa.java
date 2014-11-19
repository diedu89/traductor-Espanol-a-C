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
public class Programa extends Nodo {
    private ArrayList<Funcion> funciones;
    
    public Programa(){
        this.funciones = new ArrayList<Funcion>();
    }
    
    public Programa(Funcion funcion){
        this();
        this.funciones.add(funcion);
    }

    public Programa( ArrayList<Funcion> funciones){
        this.funciones = funciones;
    }
    
    @Override
    public String generarCodigo() {
        String codigo = "";
        for(Funcion funcion:funciones)
            codigo += funcion.generarCodigo();
        
        return codigo;
    }
    
    
}
