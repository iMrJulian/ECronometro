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
public class Min extends Cronometro {
    @Override
    public void Contador(){
        try{
           if(this.min<60){
                Thread.sleep(6000);
                this.min++;
           }else
               this.min=0;
        }catch (InterruptedException e){}
        
    }
    
}
