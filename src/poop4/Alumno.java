/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Eduardo, Mariana, Adolfo
 */
public class Alumno {
    String nombre,apellido,colegio,semestre;
    int numCuenta;

    /**
     * Constructor vacio 
     */
    public Alumno() {
    }
    
    /**
     * constructor lleno e inicializado
     * @param nombre nombre del alumno
     * @param apellido apllido del alumno
     * @param colegio colegio del alumno
     * @param semestre semestre del alumno
     * @param numCuenta numCuenta del alumno
     */
    public Alumno(String nombre, String apellido, String colegio, String semestre, int numCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colegio = colegio;
        this.semestre = semestre;
        this.numCuenta = numCuenta;
    }  
    
    /**
     * Cuantas horas estudia el alumno
     * @param horas 
     */
    public void estudiar(int horas){
        System.out.println("Hoy estudie "+horas+ " Horas seguidas");
    }
    
    /**
     * Imprime que el alumno comio
     */
    public void comer(){
        System.out.println("Ya comi, recupere energia!!");
    }
    
    /**
     * Dice cuantas tareas termino el alumno
     * @param tarea 
     */
    public void tareas(int tarea){
        System.out.println("Hoy termine "+tarea+" Tareas");
    }
    
    /**
     * Cuantas materias presto atencion el alumno
     * @param materia 
     */
    public void atencion(String materia){
        System.out.println("Hoy puse mucha atencion en la materia de "+materia);
    }
    
    /**
     * Nos dice que actividad hace el alumno para distraerse 
     * @param pasatiempo 
     */
    public void distraerse(String pasatiempo){
        System.out.println("Me despeje haciendo "+pasatiempo);
    } 
    
    /**
     * Nos imprime los atributos del alumno
     * @return 
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", colegio=" + colegio + ", semestre=" + semestre + ", numCuenta=" + numCuenta + '}';
    } 
}
