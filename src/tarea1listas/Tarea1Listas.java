/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1listas;
import model.ListaSimple;
/**
 *
 * @author Jose Ricardo Rodriguez Moya
 * @version 0.2
 * 
 * Descripcion: Tarea #1 del curso Programacion 3.
 * El proyecto implementa los 3 metodos requeridos por la tarea, los cuales son:
 *  - agregarEspaciosLista (Con la ayuda del metodo nodoGetCount)
 *  - dosMenores(Regresa los dos valores menores de la lista)
 *  - invertirLista(Invierte todos los valores de la lista segun posicion)
 * 
 * Creacion: 27 / 05 / 2017
 * Ultima revision: 28 / 05 / 2017
 */
public class Tarea1Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaSimple ls = new ListaSimple();
        
        //PRUEBA EJERCICIO 1
        
//        ls.add("1");
//        ls.add("2");
//        ls.add("3");
//        ls.add("4");
//        ls.add("5");
//        ls.add("6");
//        ls.add("7");
//        ls.add("8");
//        ls.add("9");

        ls.add("4");
        ls.add("1");
        ls.add("3");
        ls.add("9");

//        ls.add("Hola");
//        ls.add("Mundo");
//        ls.add("Soy");
//        ls.add("Troll");
        
        
        System.out.println("----PRIMER EJERCICIO\n");
        
        System.out.println("Lista: "+ls.toString()+"\n");
        
        System.out.println("Numero de Nodos: "+ls.nodoGetCount());
        System.out.println("Size Lista: "+ls.getSize()+"\n");
        
        //PRUEBA EJERCICIO 2
        
        System.out.println("----SEGUNDO EJERCICIO\n");
        
        System.out.println(ls.dosMenores()+"\n");
        
        //PRUEBA EJERCICIO 3
        
        System.out.println("----TERCER EJERCICIO\n");
        
        ls.invertirLista();
        System.out.println("Lista invertida: "+ls.toString()+"\n");
        
    }
    
}
