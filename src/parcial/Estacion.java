/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Estacion {
    private int nombre;
    private String ubicacion;
    private String fecha_instalacion;
    private Sensor sensor[]= new Sensor[3];
    private String datos;
    
    

    public Estacion() {
    }
    

    public Estacion(int nombre, String ubicacion, String fecha_instalacion ) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fecha_instalacion=fecha_instalacion;
    }
    
    public void addSensor(int j,Sensor sensores){
        sensor[j]=sensores;
        
    }
    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFecha_instalacion() {
        return fecha_instalacion;
    }

    public void setFecha_instalacion(String fecha_instalacion) {
        this.fecha_instalacion = fecha_instalacion;
    }

    public Sensor[] getSensor() {
        return sensor;
    }

    public void setSensor(Sensor[] sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        String mensaje="Estacion{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", fecha_instalacion=" + fecha_instalacion;
        for (int i = 0; i < 3; i++) {
            mensaje= mensaje+sensor[i].toString()+"\n";
        }
        
        return mensaje+'}';
    }
    
    
    
}
