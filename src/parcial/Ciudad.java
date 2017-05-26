/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ciudad {
    private String nombre_ciudad;
    private ArrayList<Estacion>estacion= new ArrayList();

    public Ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }
    
    public void addEstacion(Estacion s){
        estacion.add(s);
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }

    public ArrayList<Estacion> getEstacion() {
        return estacion;
    }

    public void setEstacion(ArrayList<Estacion> estacion) {
        this.estacion = estacion;
    }
    
}
