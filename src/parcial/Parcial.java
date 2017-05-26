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
        File registro= new File("Registro.txt");
  
        Scanner sc_registro=new Scanner(registro);
        Registro r_estaciones= new Registro(sc_registro);
        
        
        Scanner sc= new Scanner(info);
        Datos d= new Datos(sc);
        
        
       
        
    }
    
}
