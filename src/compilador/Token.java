/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compilador;

/**
 *
 * @author diego
 */
public class Token {
    public int hola = 4;
    public static enum tokenType{
        PROGRAMA, 
        INICIO_BLOQUE, 
        FIN_BLOQUE, 
        INICIO_COMENTARIO, 
        FIN_COMENTARIO, 
        LEER, 
        DESPLEGAR,
        DECLARACION,
        COMA,
        MODULO,
        RECIBE,
        DEVUELVE,
        TIPO,
        VECTOR,
        MATRIZ,
        ENTERO,
        FLOTANTE,
        CADENA,
        BOOLEANO,
        CARACTER,
        SI,
        SINO,
        FIN_SI,
        DESDE,
        HASTA,
        FIN_DESDE,
        MIENTRAS,
        FIN_MIENTRAS,
        IDENTIFICADOR,
        OP_IGUAL,
        OP_MAS,
        OP_MENOS,
        OP_POR,
        OP_DIV,
        PAR_IZQ,
        PAR_DER,
        COMP_DIFERENTE,
        COMP_MAYOR,
        COMP_MENOR,
        COMP_MAYOR_IGUAL,
        COMP_MENOR_IGUAL
    }
       
    private int line, column;
    private String value;
    private tokenType type;
    
    public Token(tokenType type, int line, int column, String value){
        this.line = line;
        this.column = column;
        this.value = value;
        this.type = type;
    }
 
    public void setLine(int line){
        this.line = line;
    }
    
    public void setColumn(int column){
        this.column = column;
    }
    
    public void setValue(String value){
        this.value = value;
    }
    
    public int getLine(int line){
        return line;
    }
    
    public int getColumn(int column){
        return column;
    }
    
    public String getValue(String value){
        return value;
    }
    
    public String toString(){
        return "<" + type.name() + ", " + this.value + ">";
    }
    
}
