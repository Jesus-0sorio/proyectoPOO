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

public class ComputadorSinGarantia extends Computador {
    private int costo;

    public ComputadorSinGarantia(int costo, String id, String marca, Propietario suPropietario) {
        super(id, marca, suPropietario);
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    public double calcularValorReparacion(){
        double res = 0;
        for (Reparacion obj: susReparaciones) {
            res = obj.calcularValorReparacion();
        }
        return res;
    }

    @Override
    public String toString() {
        return "ComputadorSinGarantia{" + "costo=" + costo + '}';
    }
    
}