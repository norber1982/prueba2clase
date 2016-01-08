/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class Plato {
    private String nombrePlato;
    private String descripcionPlato;
    private String nivelDificultad;
    private Float precio;
    private ArrayList<Ingredientes> listaIngredientes;

    public Plato(String nombrePlato, String descripcionPlato, String nivelDificultad, Float precio) {
        this.nombrePlato = nombrePlato;
        this.descripcionPlato = descripcionPlato;
        this.nivelDificultad = nivelDificultad;
        this.precio = precio;
        this.listaIngredientes = new ArrayList<>();
    }

    public Plato() {
        this.nombrePlato = null;
        this.descripcionPlato = null;
        this.nivelDificultad = null;
        this.precio = 0f;
        this.listaIngredientes = new ArrayList<>();        
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public String getDescripcionPlato() {
        return descripcionPlato;
    }

    public void setDescripcionPlato(String descripcionPlato) {
        this.descripcionPlato = descripcionPlato;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public ArrayList<Ingredientes> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingredientes> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
    
    
    
    
}
