package com.generation;

public class Main {

    public static void main(String[] args) {

        Lomito perro = new Lomito();
        perro.nombre = "Cheis";
        perro.edad = 0;
        perro.complexion= "grande";
        perro.raza = "desconocida";
        perro.caracteristicas();
        perro.comer();

        Lomito perro2 = new Lomito();
        perro2.nombre = "Firulais";
        perro2.edad = 2;
        perro2.complexion= "pequeña";
        perro2.raza = "pug";
        perro2.caracteristicas();
        perro2.dormir();

        Lomito perro3 = new Lomito("Milaneso");
        perro3.caracteristicas();

        Lomito perro4 = new Lomito("Gibi","mestizo");
        perro4.caracteristicas();

        Lomito perro5 = new Lomito("Mexi", "labrador", 4,"mediano");
        perro5.caracteristicas();
    }
}
