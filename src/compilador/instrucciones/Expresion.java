/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.instrucciones;

import compilador.Ambito;

/**
 *
 * @author diego
 */
public class Expresion {
    public String valor;
    public String tipo;
    
    public Expresion( String valor, String tipo){
        this.valor = valor;
        this.tipo = tipo;
    }
    
    public static String getTipo(String tipo){
        if(tipo.equals("ENTERO"))   return "int";
        if(tipo.equals("FLOTANTE")) return "float";
        if(tipo.equals("CADENA"))   return "char*";
        if(tipo.equals("CARACTER")) return "char";
        if(tipo.equals("BOOLEANO")) return "bool";
        return "";
    }
    
    public static String getFormat(String tipo){
        if(tipo.equals("FLOTANTE")) return "%f";
        if(tipo.equals("ENTERO"))   return "%d";
        if(tipo.equals("CARACTER")) return "%c";
        if(tipo.equals("BOOLEANO")) return "%s";
        if(tipo.equals("CADENA"))   return "%s";
        return "";
    }
}
