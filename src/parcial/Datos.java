/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.sql.Time;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Datos {
    /*    Ciudad
    Número de estaciones registradas
    Nombre Estación
    Número de datos sensores
    Fecha  Temperatura  Cantidad Agua  Nivel Eléctrico*/
    
     private String nombre_ciudad;
    private int numero;
    private String nombre;
    private int numerodatos;
    private String fecha;
    private int temperatura;
    private int mmAguaMin;
    private int carga;
    private Scanner sc;
    
     
    public Datos(Scanner sc){
        this.sc=sc;
        this.llenarDatos();
        
        
    }
    
    public void llenarDatos(){
        nombre_ciudad=sc.next();
       
        
        
        
        numero=sc.nextInt();
        
            
        for (int i = 0; i < numero; i++) {
 
           nombre=sc.next(); 
           numerodatos=sc.nextInt();
           
            for (int j = 0; j < numerodatos; j++) {
                
                fecha=sc.next();
                temperatura=sc.nextInt();
                mmAguaMin= sc.nextInt();
                carga=sc.nextInt();
                
                System.out.println(this.toString());
           }  
           
        }
       
    }
    
    public void Asignar(Registro reg){
        for (int i = 0; i < 12; i++) {
            
        }
    }

    public void promedio(){
        
    }
    @Override
    public String toString() {
        return "Datos{" + "ciudad=" + nombre_ciudad  + ", numero=" + numero + ", nombre=" + nombre + ", numerodatos=" + numerodatos
                +", fecha="+ fecha + ", temperatura=" + temperatura  + ", mmAguaMin=" + mmAguaMin + ", carga=" + carga + '}';
    }

   
    
}

