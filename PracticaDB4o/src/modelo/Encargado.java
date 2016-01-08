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
public class Encargado {
    private static int id = 0;
    private String nombreEncargado;
    private String apellidos;
    private ArrayList<Categoria> listaCategoria;

    public Encargado(String nombreEncargado, String apellidos) {
        id++;
        this.nombreEncargado = nombreEncargado;
        this.apellidos = apellidos;
        this.listaCategoria = new ArrayList<>();
    }

    public Encargado() {
        id++;
        this.nombreEncargado = null;
        this.apellidos = null;
        this.listaCategoria = new ArrayList<>();
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Encargado.id = id;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<Categoria> getListaCategoria() {
        return listaCategoria;
    }

    public void setListaCategoria(ArrayList<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }

    
    
    
    
    
    
}
