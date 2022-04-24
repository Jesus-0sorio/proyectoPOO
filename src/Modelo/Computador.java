/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LALU1026
 * @author @jesus.osorio
 */
public class Computador {
    protected String id;
    protected String marca;
    protected Propietario suPropietario;
    protected Reparacion susReparaciones ;

    public Computador(String id, String marca, Propietario suPropietario, Reparacion susReparaciones) {
        this.id = id;
        this.marca = marca;
        this.suPropietario = suPropietario;
        this.susReparaciones = susReparaciones;
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

    public Reparacion getSusReparaciones() {
        return susReparaciones;
    }

    public void setSusReparaciones(Reparacion susReparaciones) {
        this.susReparaciones = susReparaciones;
    }


    
}
