/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LALU1026
 */
public class Reparacion {
    private String tipo;
    private String descripcion;
    private double horas;

public Reparacion(String tipo, String descripcion, double horas) {
    this.tipo = tipo;
    this.descripcion = descripcion;
    this.horas = horas;
}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
}
