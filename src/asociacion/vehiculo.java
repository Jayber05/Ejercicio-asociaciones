/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacion;

/**
 *
 * @author angel
 */
public class vehiculo {
    private String placa, marca, tipo;
    private conductor conduce;
    
    public vehiculo(String placa, String marca, String tipo, conductor conduce){
        this.placa=placa;
        this.marca=marca;
        this.tipo=tipo;  
        this.conduce=conduce;
    }
    
    public void establecerplaca(){
        this.placa=placa;
    }
    public void establecermarca(){
        this.marca=marca;
    }
    public void establecertipo(){
        this.tipo=tipo;  
    }
    public void establecerconductor(){
        this.conduce=conduce;
    }
    
    public String toString(){
        return "Placa: "+placa+"\nMarca: "+marca+"\nTipo: "+tipo+"\nConductor: "+conduce.toString();
    }
}
