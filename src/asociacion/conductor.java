/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacion;

/**
 *
 * @author angel
 */
public class conductor {
    private String nombre, apellido;
    
    public conductor(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    
    public void establecernombre(){
        this.nombre=nombre;
    }
    public void establecerapellido(){
        this.apellido=apellido;
    }
    
    public String toString(){
        return "Nombre: "+nombre+"\nApellido: "+apellido;
    }
}
