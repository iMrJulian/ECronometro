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
public class DcSeg extends Cronometro {

    @Override
    public void Contador(){
        try{
           if(this.dcseg<10){
                Thread.sleep(100);
                this.dcseg++;
           }else
               this.dcseg=0;
        }catch (InterruptedException e){}
        
    }
}
