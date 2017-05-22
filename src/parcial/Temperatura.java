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
public class Temperatura extends Sensor{
    private int temperatura;

    public Temperatura(String marca, int referencia, Time fecha) {
        super(marca, referencia, fecha);
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    
}
