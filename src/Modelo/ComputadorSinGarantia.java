/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LALU1026
 * 
 */
public class ComputadorSinGarantia {
    private int costo;

    public ComputadorSinGarantia(int costo) {
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "ComputadorSinGarantia{" + "costo=" + costo + '}';
    }
    
}
