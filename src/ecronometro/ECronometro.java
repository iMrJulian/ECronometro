/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecronometro;
import Unidades.*;
import Cronometro.*;

/**
 *
 * @author david
 */
public class ECronometro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cronometro a,b,c,d;
        a = new DcSeg();
        b = new Seg();
        c = new Min();
        d = new Horas();
    do{
        a.Contador();
        b.Contador();
        c.Contador();
        d.Contador();
    }
    
}
