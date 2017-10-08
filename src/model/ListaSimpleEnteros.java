/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ricardo Rodriguez
 */
public class ListaSimpleEnteros {
    
    private NodoEntero cabeza;
    private NodoEntero ultimo;
    private int size;

    public ListaSimpleEnteros() {
        
        this.cabeza = null;
        this.ultimo = null;
        this.size = 0;
        
    }

    public NodoEntero getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoEntero cabeza) {
        this.cabeza = cabeza;
    }

    public NodoEntero getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoEntero ultimo) {
        this.ultimo = ultimo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    /**
     * <h1>toString</h1>
     * <p>
     * Metodo que muestra la lista de datos.</p>
     *
     * @return String: Lista de datos
     */
    @Override
    public String toString(){
        
        NodoEntero aux = cabeza; //Inicializa el nodo auxiliar con el valor de la cabeza
        String resultado = "";
     
        for(int i = 0; i < size; i++){
            
            resultado +="[" + aux.getDato()+ "] "; //Toma el dato del auxiliar y lo agrega al string
            
            if(aux.getSig() == null){
                
                break;
                
            }else{
                
                aux = aux.getSig(); //le da un nuevo valor al auxiliar, el valor dado es del nodo que sigue, osea se corre un campo
                
            }

            
        }
        
        return resultado;
    }
    
    /**
     * <h1>Add</h1>
     * <p>
     * Metodo que agrega un numero al final de la lista. La lista solo
     * acepta 30 nodos</p>
     *
     * @param dato el numero a guardar
     * @return boolean: el resultado de la operacion
     */
    public boolean add(int dato){
        
        NodoEntero nuevo = new NodoEntero(dato);
        
        try{
            
            if(cabeza == null){

                cabeza = nuevo;
                ultimo = nuevo;

            }else{

                ultimo.setSig(nuevo);
                ultimo = nuevo;

            }
            
            size++;
            
            return true;

        }catch(Exception e){
            
            System.out.println(e.getMessage());
            return false;
        }  
    }
    /**
     * <h1>eliminarRepetidos</h1>
     * <p>
     * Metodo que elimina los numeros repetidos de la lista.</p>
     *
     * @return boolean: el resultado de la operación
     */
    
    public boolean eliminarRepetidos(){
        
        NodoEntero aux = cabeza;
        NodoEntero aux2 = cabeza;
        int x;
         
        for(int i = 0; i < size-1; i++){
            
            x = aux2.getDato();
            
            for(int j = 0; j < size-1; j++){

                if(aux.getSig().getDato() == x){
                    
                    aux.setSig(aux.getSig().getSig());
                    size--;
                }
                
                aux = aux.getSig();
                
            }
            
            aux = cabeza;
            aux2 = aux2.getSig();
            
        }
        
        return true;
    }
    
}
