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
    
     private String ciudad,datos;
    private int numero;
    private String nombre;
    private int numerodatos;
     int dia,mes,anio;
    private String fecha;
    private int temperatura;
    private int mmAguaMin;
    private int carga;
    private Scanner sc;
    private Estacion estacion[];
    public void llernarDatos(Scanner sc){
    this.sc=sc;
        ciudad=sc.next();
        
        numero=sc.nextInt();
        
        
        estacion= new Estacion[numero];
        for (int i = 0; i < numero; i++) {
            
           estacion[i]=new Estacion();
           nombre=sc.next();
           estacion[i].setNombre(nombre);
           numerodatos=sc.nextInt();
           
            for (int j = 0; j < numerodatos; j++) {
                fecha=sc.next();
                /* sc.useDelimiter("/");
                dia=sc.nextInt();
                mes=sc.nextInt();
                anio=sc.nextInt();
                fecha= new Time(dia,mes,anio);
                
           sc.useDelimiter(" ");
           temperatura=sc.nextInt();
           mmAguaMin= sc.nextInt();
           carga=sc.nextInt();
           //sc.useDelimiter(" ");
*/
           
           }  
           System.out.println(this.toString());
        }
       
    }

    @Override
    public String toString() {
        return "Datos{" + "ciudad=" + ciudad + ", datos=" + datos + ", numero=" + numero + ", nombre=" + nombre + ", numerodatos=" + numerodatos + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", fecha=" + fecha + ", temperatura=" + temperatura + ", mmAguaMin=" + mmAguaMin + ", carga=" + carga + ", sc=" + sc + ", estacion=" + estacion + '}';
    }

   
    
}

