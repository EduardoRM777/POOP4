/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Eduardo, Mariana, Adolfo
 */
public class Punto {
    int x,y;

    /**
     * Contructor vacio
     */
    public Punto() {
    }

    /**
     * Constructor lleno e inicializado 
     * @param x
     * @param y 
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Imprime el punto (x,y)
     */
    public void imprimirPunto(){
        System.out.println("x="+x+" , y="+y);
    }
    
    /**
     * Imprime los atributos del cohce 
     * @return 
     */
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
    
}
