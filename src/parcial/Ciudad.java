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
    private String ciudad,datos;
    private int numero;
    private Scanner sc;
    private Estacion estacion[]= new Estacion[3];

    public Ciudad() {
        ciudad="";
    }

   
    

    public Ciudad(Scanner sc) {
        this.sc=sc;
        ciudad=sc.next();
        
        numero=sc.nextInt();
        
        
        
        estacion= new Estacion[numero];
        for (int i = 0; i < numero; i++) {
            
           estacion[i]=new Estacion();
           estacion[i].setNombre(sc.next());
           estacion[i].setNumeroDatos(sc.nextInt());
            for (int j = 0; j < estacion[i].getNumeroDatos(); j++) {
                datos=(""+sc.next());
                
            }
            
        }
       
        
    }

    @Override
    public String toString() {
        return "Ciudad{" + "ciudad=" + ciudad + ", numero=" + numero + '}';
    }
    
    
     public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
