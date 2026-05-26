package Metodologia1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian Alexis Lucio Narvaez 
 */
public class Cola {
    private Nodo inicio;
    private Nodo fin;
    
    //Método constructor
    public void Cola(){
        inicio=null;
        fin= null;
    }
    
    //Método isEmpty
    public boolean esVacia(){
        return inicio == null;
    }
    
    //Otras altenativas de verificación de cola vacía
    /*public boolean esVacia(){
       return final == null;
      }
      public boolean esVacia(){
      return inicio == null && final == null;
    */
    
    //Método Push
    public void encolar(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public int desencolar(){
        if (!esVacia()) {
            int dato = inicio.getValor();
            if (inicio==fin) {
                inicio = null;
                fin = null;
            }else{
                inicio = inicio.getSiguiente();
            }
            return dato;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    
    // Método eliminar pila(vaciar cola)
    /*En java una vez que una variable dinámica no 
    se encuentra referenciada se elimina automáticamente*/
    public void eliminar() {
        inicio = null;
        fin = null;
    }

    //Método retirar (elimina frente sin devolver valor)
    /*Otra alternativa de extraer un elemento sin la necesidad de
    devolver el valor del nodo*/
    public void retirar() {
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            if (inicio == null) fin = null;
        }
    }
    
    // Método mostrarCola (recorrer e imprimir)
    /*Asumiendo que se desea mostrar toda la información de la Pila*/
    public void mostrarCola() {
        Nodo aux = inicio;//Crea una copia de la Cola
        while (aux != null) {//Recorre la Cola hasta el último nodo
            System.out.println("| " + aux.getValor() + " |");
            aux = aux.getSiguiente();
        }
    }

    // Método cantidad (contar nodos)
    public int cantidad() {
        int cant = 0;
        Nodo aux = inicio;
        while (aux != null) {
            cant++;
            aux = aux.getSiguiente();
        }
        return cant;
    }

    // Método cima (consultar frente sin eliminar)
    /*El manejo de excepciones es una técnica de programación que 
    permite el programador controlar los errores ocasionados
    durante la ejecución del programa informático.
    Las excepciones se usan para indicar que se ha producido
    un error mientras se ejecutaba el programa. Se crean los objetos
    excepción que describen un error y, luego, se produce con la
    */
    public int cima() throws Exception {
        if (!esVacia()) {
            return inicio.getValor();
        } else {
            throw new Exception("La cola se encuentra vacía.");
        }
    }
 
}
