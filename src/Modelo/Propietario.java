<<<<<<< HEAD
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
public class Propietario implements Serializable {
    private int cedula;
    private String nombre;
    private int celular;

    public Propietario(int cedula, String nombre, int celular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.celular = celular;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return " Cedula =" + cedula;
    }

    
}
=======
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
public class Propietario implements Serializable {
    private int cedula;
    private String nombre;
    private int celular;

    public Propietario(int cedula, String nombre, int celular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.celular = celular;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Propietario{" + "cedula=" + cedula + ", nombre=" + nombre + ", celular=" + celular + '}';
    }
    
    

    
}
>>>>>>> 6526e3ae95908568a36c097caf2e323598b8b1d7
