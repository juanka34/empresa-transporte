/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author usuario
 */
public class Camion extends Vehiculo{
    
    private int volumen;
    
     public void mostrar(){
       System.out.println(this.volumen);
       super.mostrar();
   }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    
    
    
}
