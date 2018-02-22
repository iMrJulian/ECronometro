/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidades;
import Cronometro.*;
/**
 *
 * @author david
 */
public class Horas extends Cronometro{
    
    @Override
    public void Contador(){
        try{
           if(this.horas<10){
                Thread.sleep(3600000);
                this.horas++;
           }else
               this.horas=0;
        }catch (InterruptedException e){}
        
    }
    
}
