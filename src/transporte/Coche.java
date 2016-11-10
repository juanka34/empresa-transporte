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
public class Coche extends Vehiculo{
    
    private String color;
     public void mostrar(){
       System.out.println(this.color);
       super.mostrar();
   }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
