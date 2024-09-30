/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asociacion;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejecutor_Asociacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, apellido, placa, marca, tipo;
        int conduce;
        
        Scanner entrada= new Scanner(System.in);
        
        conductor conductor1[]=new conductor[3];
         for (int i = 0; i < conductor1.length; i++) {
        
        System.out.println("ingresa nombre " + (i + 1));
        nombre=entrada.next();
        System.out.println("ingresa apellido " + (i + 1));
        apellido=entrada.next();
        
        conductor1[i]= new conductor(nombre, apellido);
        
         }
        for (conductor conductores: conductor1){
            System.out.println("");
            System.out.println(conductores.toString());
            System.out.println("");
        }
         vehiculo D1[]=new vehiculo[3];
         
        for (int i = 0; i < D1.length; i++) { 
        
        System.out.println("ingresa placa "+ (i + 1));
        placa=entrada.next();
        System.out.println("ingresa marca "+ (i + 1));
        marca=entrada.next();
        System.out.println("ingresa tipo "+ (i + 1));
        tipo=entrada.next();
        System.out.println("quien conduce? "+ (i + 1));
        conduce=entrada.nextInt();
        
        
        
        D1[i]= new vehiculo(placa, marca, tipo, conductor1[conduce]);
        
        }
        for (vehiculo vehiculos: D1){
            System.out.println("");
            System.out.println(vehiculos.toString());
            System.out.println("");
        }
    }
    
}
