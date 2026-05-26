/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodogia2;

/**
 *
 * @author Usuario1
 */
public class Cola {
//Clase que crea la estructura del Nodo
    class Nodo{
        int valor;
        Nodo sig;
    }
 //Variable estática que controla la cola
    private Nodo tope;
    private Nodo fin;
 
 //Inicialización en el constructor
    Cola(){
    tope = null;
    fin = null;
    }
    public void insertar(int x){
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.valor = x;
        nuevo.sig = null; 
        if (tope==null) {
            tope =nuevo;
            fin = nuevo;
        }else{
            fin.sig = nuevo;
            fin = nuevo;
        }
    }
    public int extraer(){
        if (tope!=null) {
            int dato = tope.valor;
            if (tope==fin) {
                tope=null;
                fin=null;
            }else{
                tope = tope.sig;
            }
            return dato;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    public int retornar(){
        if (tope!=null) {
        int dato = tope.valor;
        return dato;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    public void imprimir(){
        Nodo reco = tope;
        System.out.println("Listado de cola.");
        while(reco!=null){
            System.out.print(reco.valor+"-");
            reco=reco.sig;
        }
        System.out.println();
    }
}
