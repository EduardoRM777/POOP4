/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Eduardo,Mariana,Eduardo
 */
public class Coche {
    String marca, modelo, color, motor, combustible;

    /**
     * Constructor vacio 
     */
    public Coche() {
    }

    /**
     * constructor lleno e inicializado
     * @param marca del coche 
     * @param modelo del coche 
     * @param color del coche 
     * @param motor del coche 
     * @param combustible del coche 
     */
    public Coche(String marca, String modelo, String color, String motor, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.combustible = combustible;
    }
   
    /**
     * Imprime que el coche avanza 
     */
    public void avanzar(){
        System.out.println("El coche avanzó");
    }
    
    /**
     * Imprime que el coche retrocede 
     */
    public void retroceder(){
        System.out.println("El coche retrocedió");
    }
    
    /**
     * Imprime que el coche prendio 
     */
    public void prender(){
        System.out.println("Prendió");
    }
    
    /**
     * Imprime que el coche se apago 
     */
    public void apagar(){
        System.out.println("Apagado");
    }
    
    /**
     * Nos dice hacia que direccion gira el coche 
     * @param lado al que gira el coche 
     */
    public void girar(String lado){
        System.out.println("El coche gira a la "+lado);
    }

    /**
     * Nos imprime los atributos del coche 
     * @return 
     */
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor + ", combustible=" + combustible + '}';
    }    
    
    
}
