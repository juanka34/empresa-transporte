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
public abstract class Envio {
    
    private int peso;
    private double fecha;
    
    
    
     public void mostrar(){
       System.out.println(this.fecha);
       System.out.println(this.peso);
   }

    public int getPeso() {
        return peso;
    }

   

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getFecha() {
        return fecha;
    }

    public void setFecha(double fecha) {
        this.fecha = fecha;
    }
    
    
}
