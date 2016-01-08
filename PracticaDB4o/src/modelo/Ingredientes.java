/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Angel
 */
public class Ingredientes {
    private String nombreIngrediente;

    public Ingredientes(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public Ingredientes() {
        this.nombreIngrediente = null;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }
    
    
    
    
}
