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
public class Seg extends Cronometro {
    
    @Override
    public void Contador(){
        try{
           if(this.seg<60){
                Thread.sleep(1000);
                this.seg++;
           }else
               this.seg=0;
        }catch (InterruptedException e){}
        
    }
}
    

