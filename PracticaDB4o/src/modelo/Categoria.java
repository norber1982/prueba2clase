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
public class Categoria {
    private String nombreCategoria;
    private String descripcionCategioria;
    private ArrayList<Plato> listaPlatos;

    public Categoria(String nombreCategoria, String descripcion) {
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategioria = descripcion;
        this.listaPlatos = new ArrayList<>();
    }

    public Categoria() {
        this.nombreCategoria = null;
        this.descripcionCategioria = null;
        this.listaPlatos = new ArrayList<>();
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcionCategioria() {
        return descripcionCategioria;
    }

    public void setDescripcionCategioria(String descripcionCategioria) {
        this.descripcionCategioria = descripcionCategioria;
    }

    public ArrayList<Plato> getListaPlatos() {
        return listaPlatos;
    }

    public void setListaPlatos(ArrayList<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }
    
    
    
    
    
    
}
