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
    private String referencia;
    private String fecha_instalacion;
    private int medida;

    public Sensor(String marca, String referencia, String fecha) {
        this.marca = marca;
        this.referencia = referencia;
        this.fecha_instalacion = fecha;   
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return " Sensor{" + "marca=" + marca + ", referencia=" + referencia + ", fecha_instalacion=" + fecha_instalacion + ", medida=" + medida + '}';
    }

   

    
}
