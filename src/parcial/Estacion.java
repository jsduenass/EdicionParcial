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
    private int numeroDatos;
    private String nombre;
    private String ubicacion;
    private Sensor sn[]= new Sensor[3];
    private String datos;
    

    public Estacion() {
    }
    

    public Estacion(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    
    public void interpretarDatos(){
         Scanner sc= new Scanner(datos); 
         int dia,mes,anio;
         
         sc.useDelimiter("/");
         dia=sc.nextInt();
         mes=sc.nextInt();
         anio=sc.nextInt();
        // fecha= new Time(dia,mes,anio);
         
         
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Sensor[] getSn() {
        return sn;
    }

    public void setSn(Sensor[] sn) {
        this.sn = sn;
    }

    public int getNumeroDatos() {
        return numeroDatos;
    }

    public void setNumeroDatos(int numeroDatos) {
        this.numeroDatos = numeroDatos;
    }
    
    
}
