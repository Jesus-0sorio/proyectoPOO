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
 * @author @jesus.osorio
 */
public class ComputadorAfiliado {
    private LocalDate finGarantia;

    public ComputadorAfiliado(LocalDate finGarantia) {
        this.finGarantia = finGarantia;
    }

    public LocalDate getFinGarantia() {
        return finGarantia;
    }

    public void setFinGarantia(LocalDate finGarantia) {
        this.finGarantia = finGarantia;
    }
    
}
