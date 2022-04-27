/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author LALU1026
 * 
 */
public class ComputadorConGarantia extends Computador {
    private LocalDate finGarantia;

    public ComputadorConGarantia(LocalDate finGarantia, String id, String marca, Propietario suPropietario) {
        super(id, marca, suPropietario);
        this.finGarantia = finGarantia;
    }  
    
    public LocalDate getFinGarantia() {
        return finGarantia;
    }

    public void setFinGarantia(LocalDate finGarantia) {
        this.finGarantia = finGarantia;
    }
    
    public double calcularValorReparacion(){
        double res = 0;
        for(Reparacion obj: susReparaciones){
            res = (obj.calcularValorReparacion())/5;
        }
        return res;
    }

    @Override
    public String toString() {
        return "ComputadorConGarantia{" + "finGarantia=" + finGarantia + '}';
    }    
    
}
