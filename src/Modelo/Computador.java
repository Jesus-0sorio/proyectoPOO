/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author LALU1026
 *
 */
public class Computador {
    protected String id;
    protected String marca;
    protected Propietario suPropietario;
    protected ArrayList<Reparacion> susReparaciones;

    public Computador(String id, String marca, Propietario suPropietario) {
        this.id = id;
        this.marca = marca;
        this.suPropietario = suPropietario;
        susReparaciones = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Propietario getSuPropietario() {
        return suPropietario;
    }

    public void setSuPropietario(Propietario suPropietario) {
        this.suPropietario = suPropietario;
    }

    public ArrayList<Reparacion> getSusReparaciones() {
        return susReparaciones;
    }

    public void setSusReparaciones(ArrayList<Reparacion> susReparaciones) {
        this.susReparaciones = susReparaciones;
    }

    @Override
    public String toString() {
        return "Computador{" + "id=" + id + ", marca=" + marca + ", suPropietario=" + suPropietario + ", susReparaciones=" + susReparaciones + '}';
    }         
    
}
