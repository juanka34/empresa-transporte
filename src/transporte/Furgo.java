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
public class Furgo extends Vehiculo{
    private int pma;
    
    
     public void mostrar(){
       System.out.println(this.pma);
       super.mostrar();
   }

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }
    
}
