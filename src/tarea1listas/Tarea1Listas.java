/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1listas;
import model.ListaSimple;
import model.ListaSimpleEnteros;
/**
 *
 * @author Jose Ricardo Rodriguez Moya
 * @version 0.1
 * 
 * Descripcion: Tarea #1 del curso Programacion 3.
 * El proyecto implementa los 3 metodos requeridos por la tarea, los cuales son:
 *  - agregarEspaciosLista (Con la ayuda del metodo nodoGetCount)
 *  - eliminarRepetidos(Elimina los valores repetidos en la lista)
 *  - invertirLista(Invierte todos los valores de la lista segun posicion)
 * 
 * Creacion: 04 / 10 / 2017
 * Ultima revision: 04 / 10 / 2017
 */
public class Tarea1Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaSimple ls = new ListaSimple();                //Lista de Strings
        ListaSimpleEnteros le = new ListaSimpleEnteros();  //Lista de enteros
        
        //PRUEBA EJERCICIO 1
        
        /*Se agregan 31 nodos de modo que muestre un error, ya que la lista solo
        acepta 30.*/
        
        ls.add("1");
        ls.add("2");
        ls.add("3"); 
        ls.add("4");
        ls.add("5");
        ls.add("6");
        ls.add("7");
        ls.add("8");
        ls.add("9");
        ls.add("10");
        ls.add("11");
        ls.add("12");
        ls.add("13");
        ls.add("14");
        ls.add("15");
        ls.add("16");
        ls.add("17");
        ls.add("18");
        ls.add("19");
        ls.add("20");
        ls.add("21");
        ls.add("22");
        ls.add("23");
        ls.add("24");
        ls.add("25");
        ls.add("26");
        ls.add("27");
        ls.add("28");
        ls.add("29");
        ls.add("30");
        ls.add("31");
        
        /*Nodos para provar eliminar numeros repetidos*/
        le.add(2);
        le.add(2);
        le.add(2);
        le.add(9);
        le.add(9);
        le.add(9);
        
        /*Nodos para provar invertir la lista*/
//        ls.add("Hola");
//        ls.add("Mundo");
//        ls.add("Soy");
//        ls.add("Troll");
        
        
        System.out.println("----PRIMER EJERCICIO\n");
        
        System.out.println("Lista String: "+ls.toString()+"\n");
        
        System.out.println("Numero de Nodos lista Strings: "+ls.nodoGetCount());
        System.out.println("Size Lista: "+ls.getSize()+"\n");
        
        
        //PRUEBA EJERCICIO 2
        
        System.out.println("----SEGUNDO EJERCICIO\n");
        
        le.eliminarRepetidos();
        System.out.println("Lista int: "+le.toString()+"\n");
          
        
        //PRUEBA EJERCICIO 3
        
        System.out.println("----TERCER EJERCICIO\n");
        
        if(ls.invertirLista()){
            System.out.println("Lista invertida: "+ls.toString()+"\n");
        }else{
            System.out.println("La lista esta vacia");
        }
        
    }
    
}
