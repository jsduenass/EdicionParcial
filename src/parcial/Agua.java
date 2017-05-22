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
public class Agua extends Sensor{
    private int mmAguaMin;

    public Agua(String marca, int referencia, Time fecha) {
        super(marca, referencia, fecha);
    }

    public int getMmAguaMin() {
        return mmAguaMin;
    }

    public void setMmAguaMin(int mmAguaMin) {
        this.mmAguaMin = mmAguaMin;
    }
    
    
}
