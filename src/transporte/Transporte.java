/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Transporte {
    
    
     static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
      static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
       static ArrayList<Envio> envios = new ArrayList<Envio>();
    
    
     public static void rellenardatos(){
         
          Empleado emp;
        for (int i = 0; i < 10; i++) {//empleados
            emp = new Empleado();
            emp.setEdad(i);
            emp.setNombre("empleado" + i);
            empleados.add(emp);
            
            
        }
        
            
            Camion cm;
            Coche c;
            Furgo f;
            for (int i = 0; i < 10; i++) {
                
              
                
                c=new Coche();
                c.setColor("color");
                c.setMarca("marca  coche");
                c.setMatricula(2+i);
                vehiculos.add(c);
                
                f= new Furgo();
                f.setMarca("marca  furgo");
                f.setMatricula(i);
                f.setPma(i);
                vehiculos.add(f);
                
                cm =new Camion();
                cm.setMarca("marca camion");
                cm.setMatricula(i);
                cm.setVolumen(i);
                
                vehiculos.add(cm);
            }
            
            Envio24h e24;
            Envioazul ea;
            for (int i = 0; i < 10; i++) {
                
                e24 =new Envio24h();
                e24.setFecha(i);
                e24.setPrioridad("prioridad envio 24horas");
                e24.setPeso(i+10);
                envios.add(e24); 
                
                ea =new Envioazul();
                ea.setFecha(i);
                ea.setPeso(i);
                ea.setValor(i); 
                envios.add(ea);      
         }
         
            
            
            
     }       
            
       public static void mostrarTodosEnvios(){
           for (int i = 0; i < envios.size(); i++) {
                envios.get(i).mostrar();
            
               
           }
              
       }     
            
        public static void mostrarEnvio24hMayorPeso(){
            
            
            double max=0;
            Envio24h envioMax =null;
            for (int i = 0; i < envios.size(); i++) {
                
                if (envios.get(i) instanceof Envio24h) {
                    if(envios.get(i).getPeso() > max){
                         max = envios.get(i).getPeso();
                         envioMax =  (Envio24h) envios.get(i);
                         
                    }            
                }        
            }    
       }          
            
      
          public static void mostrarSumaPorTipoDePeso(){
              double pesoAzul= 0;
              double peso24 =  0;
              for (int i = 0; i < envios.size(); i++) {
                  
                  if (envios.get(i) instanceof Envio24h){
                      
                  }
                  
              }
           
           
           
           
           
           
           
       }  
          public static void asignarEmpleadosAVehiculos(Empleado e,Vehiculo v){
              v.setConductor(e);
           
           
           
           
           
           
           
       }  
        
            
            public static void asignarEmpleadosAVehiculos(Empleado e,Vehiculo v){
              v.setConductor(e);
           
           
           
           
           
           
           
       }     
         
         
         
         
         
         
         
         
         
     
    
    
    
    
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //rellenardatos();
        // mostrarTodosEnvios();
        // mostrarEnvio24hMayorPeso();
         //mostrarSumaPorTipoDePeso();
         
         
         
         Vehiculo miVehiculo= vehiculos.get(2);
         Empleado miEmpleado = empleados.get(2);
         
         //asignarEmpleadosAVehiculos(miVehiculo,miEmpleado);
         
         
         
         
         
         
    }
    
}
