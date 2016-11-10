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
public class Envioazul extends Envio{
        
        
        private int valor;
        
        
          
   
     public void mostrar(){
       System.out.println(this.valor);
       super.mostrar();
   }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

        
    
}
