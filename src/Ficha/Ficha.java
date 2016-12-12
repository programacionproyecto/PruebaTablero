/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficha;

/**
 *
 * @author JoseLuis
 */
public class Ficha {
    protected String nombre;
    protected String tipo;
    protected int rango;

    public Ficha(String nombre, String tipo, int rango) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getRango() {
        return rango;
    }
    
    
}
