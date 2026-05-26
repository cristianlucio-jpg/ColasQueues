package Metodologia1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Cristian Alexis Lucio Narvaéz
 */
public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();

        // Insertar elementos en la cola
        cola.encolar(4);
        cola.encolar(16);

        // Extraer elementos y mostrarlos
        System.out.println("Elemento: " + cola.desencolar() + " Sale");
        System.out.println("Elemento: " + cola.desencolar() + " Sale");
    }
}

