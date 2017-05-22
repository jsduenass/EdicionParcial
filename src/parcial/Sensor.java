/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.sql.Time;

/**
 *
 * @author Estudiante
 */
public class Sensor {
    private String marca;
    private int referencia;
    private Time fecha;

    public Sensor(String marca, int referencia, Time fecha) {
        this.marca = marca;
        this.referencia = referencia;
        this.fecha = fecha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public Time getFecha() {
        return fecha;
    }

    public void setFecha(Time fecha) {
        this.fecha = fecha;
    }
    
    
    
}
