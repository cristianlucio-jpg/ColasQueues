/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodogia2;

/**
 *@author Cristian Alexis Lucio Narvaez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Cola cola1 = new Cola();
    cola1.insertar(10);
    cola1.insertar(40);
    cola1.insertar(3);

    cola1.imprimir();
    System.out.println("Extraemos Nodo:" + cola1.extraer());
    cola1.imprimir();
    System.out.println("Retornamos Nodo:" + cola1.retornar());
    cola1.imprimir();
}

    
}
