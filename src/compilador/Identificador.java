/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import compilador.instrucciones.Expresion;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Identificador {
    public String tipoDato;
    public String tipoId;
    public String identificador;
    public int columnas;
    public int filas;
    public ArrayList<Expresion> argumentos;
    public Boolean init;
    
    public Identificador(String identificador, String tipoDato){
        this.identificador = identificador;
        this.tipoId = "primitivo";
        this.tipoDato = tipoDato;
    }
    
    public Identificador(String identificador, String tipoDato, int filas){
        this.identificador = identificador;
        this.tipoDato = tipoDato;
        this.tipoId = "arreglo";
        this.filas = filas;
    }
    
    public Identificador(String identificador, String tipoDato, int filas, int columnas){
        this(identificador, tipoDato);
        this.tipoId = "matriz";
        this.filas = filas;
        this.columnas = columnas;
    }
    
    public Identificador(String identificador, String tipoDato, ArrayList<Expresion> identificadores){
        this(identificador, tipoDato);
        this.tipoId = "funcion";
        this.argumentos = identificadores;
    }
}
