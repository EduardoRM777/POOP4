/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author eduardo,mariana,adolfo
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto = new Punto();
        punto.imprimirPunto();
        Punto punto2 = new Punto(3, 5);
        punto2.imprimirPunto();
        System.out.println(punto);
        
        Coche coche = new Coche("Mazda", "rojo", "2019", "automático", "diesel");
        coche.girar("derecha");
        System.out.println(coche.toString());
        System.out.println(coche);
        System.out.println("                  ***Alumno***");
        Alumno alumno = new Alumno("Juanito","Perez","UNAM","2024-1",123456789);
        alumno.estudiar(3);
        alumno.comer();
        alumno.tareas(2);
        alumno.atencion("Ecuaciones difrenciales");
        alumno.distraerse("Ejercicio");
        
    }
    
}
