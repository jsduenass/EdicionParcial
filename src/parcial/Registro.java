/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;

/**
 *
 * @author juan sebastian
 */
public class Registro {
    private int number;
    private int nombre ;
    private String ubicacion;
    private String fecha_instalacion;
    private String marca; 
    private String referencia;
    private Scanner sc;
    private Ciudad city[]=new Ciudad[12];
    

    public Registro(Scanner sc) {
        
        this.sc = sc;
        for (int i = 0; i < 12; i++) {
            city[i]=new Ciudad(sc.next());
            
        }
        number=sc.nextInt();
        Estacion estacion[] =new Estacion[number];
        
        for (int i = 0; i < number; i++) {
         
         nombre=sc.nextInt();
         ubicacion= sc.next();
         fecha_instalacion=sc.next();
         estacion[i]= new Estacion(nombre,ubicacion,fecha_instalacion);
         for (int j = 0; j < 3; j++) {
             marca=sc.next();
             referencia=sc.next();
             estacion[i].addSensor(j, new Sensor(marca,referencia,fecha_instalacion));
         }
            System.out.println(estacion[i].toString());
        }
    }   

    public Ciudad[] getCity() {
        return city;
    }

    public void setCity(Ciudad[] city) {
        this.city = city;
    }
    
   
    
}
