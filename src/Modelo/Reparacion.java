/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author LALU1026
 */
public class Reparacion implements Serializable {
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
    
    public double calcularValorReparacion(){
        double res;
        if(tipo.equals("SOFTWARE")){
            res = horas*25000;
        }
        else{
            res = horas*30000;
        }
        return res;
    }

    @Override
    public String toString() {
        return "Reparacion{" + "tipo=" + tipo + ", descripcion=" + descripcion + ", horas=" + horas + '}';
    }
}