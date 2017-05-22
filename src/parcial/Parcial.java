/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        File info= new File("Formato.txt");
        
        System.out.println(info.exists());
        Scanner sc=new Scanner(info);
        Datos d= new Datos();
        d.llernarDatos(sc);
        
        
        Ciudad city[]= new Ciudad[12];
        for (int i = 0; i < 12; i++) {
            city[i]=new Ciudad ();
            
        }
        /*for (int i = 0; i < 12; i++) {
        if(city[i].getCiudad()==sc.next()){
        
        }
        }
        
        System.out.println(city.toString());*/
        //sc.useDelimiter();
        /* String n;
        for (int i = 0; i < 4; i++) {
        n= sc.next();
        System.out.print(n+"  ");
        //sc.nextLine();
        }*/
       
        
        
        
    }
    
}
