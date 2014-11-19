/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.instrucciones;

/**
 *
 * @author diego
 */
public class Funcion extends Nodo{
    private Bloque bloque;
    private String nombre;
    private String tipo;
    
    public Funcion(String nombre, Bloque bloque, String tipo){
        this.nombre = nombre;
        this.bloque = bloque;
        this.tipo = tipo;
    }

    @Override
    public String generarCodigo() {
        return super.generarCodigo() + tipo + " " + nombre + "()" + bloque.generarCodigo();
    }
    
}
