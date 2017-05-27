/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1listas;
import model.ListaSimple;
/**
 *
 * @author joser
 */
public class Tarea1Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaSimple ls = new ListaSimple();
        
        //PRUEBA EJERCICIO 1
        
        ls.add("1");
        ls.add("2");
        ls.add("3");
        ls.add("4");
        ls.add("5");
        ls.add("6");
        ls.add("7");
        ls.add("8");
        ls.add("9");
        
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
