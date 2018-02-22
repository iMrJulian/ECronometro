/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cronometro;

/**
 *
 * @author david
 */
public abstract class Cronometro {
     public int horas=0;
     public int min=0;
     public int seg=0;
     public int dcseg=0;

    public int getHoras() {
        return horas;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public int getDcseg() {
        return dcseg;
    }

    
    public abstract void Contador();
}
