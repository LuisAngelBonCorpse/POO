package com.generation;

public class Lomito {

    String nombre;
    String raza;
    int edad;
    String complexion;

    /*
        Constructores
        Para saber en qué constructor entrará tendría que ver con el tipo de dato que halla en el parámetro, por lo que no se pueden tener dos constructores con el mismo número de parámetros del mismo tipo.
    */

    public Lomito (){ //constructor vacío
    }

    public Lomito (String nombre){ // constructor con un parámetro
        this.nombre = nombre;
    }

    public Lomito (String nombre, String raza){ // constructor con dos parámetros
        this.nombre = nombre;
        this.raza = raza;
    }

    public Lomito (String nombre, String raza, int edad, String complexion){ //constructor con todos los parámetros
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.complexion = complexion;
    }

    public void caracteristicas() {
        System.out.println("Guau, guau guauuuu guau " + this.nombre +". Guau, guau guauuuu guau "+this.raza+". Guau, guau guauuuu guau "+this.edad +". Guau, guau guauuuu guau "+this.complexion);
    }
    public void dormir (){
        System.out.println("Zzzzzz");
    }
    public void comer (){
        System.out.println("Estoy comiendo");
    }
    public void jugar (){
        System.out.println("Estoy juegando");
    }
}
