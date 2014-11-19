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
public class Nodo {
    public static int tabs = 0;

    public String generarCodigo(){
        String codigo = "\n";
        if(tabs > 0)
            for(int i = 0; i < tabs; i++) codigo += "\t";
        
        return codigo;
    }
}
