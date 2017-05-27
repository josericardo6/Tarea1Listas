/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author joser
 */
public class ListaSimple {
    
    private Nodo cabeza;
    private Nodo ultimo;
    private int size;

    public ListaSimple() {
        
        this.cabeza = null;
        this.ultimo = null;
        this.size = 10;
        
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
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
     * Muestra la lista de datos.</p>
     *
     * @return String: el resultado de la operacion
     */
    @Override
    public String toString(){
        
        Nodo aux = cabeza; //Inicializa el nodo auxiliar con el valor de la cabeza
        String resultado = "";
     
        for(int i = 0; i < nodoGetCount(); i++){
            
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
     * Agrega un numero al final de la lista.</p>
     *
     * @param dato el numero a guardar
     * @return boolean: el resultado de la operacion
     */
    public boolean add(String dato){
        
        Nodo nuevo = new Nodo(dato);
        
        if(cabeza == null){
            
            cabeza = nuevo;
            ultimo = nuevo;
            
        }else{
            
            ultimo.setSig(nuevo);
            ultimo = nuevo;
            
        }
        
        agregarEspaciosLista();
        
        return true;
    }
    
    /**
     * <h1>agregarEspaciosLista</h1>
     * <p>
     * Agrega 10 espacios a la lista cuando solo le queda un espacio.</p>
     *
     * @return boolean: el resultado de la operacion
     */
    public boolean agregarEspaciosLista(){
        
        if(Integer.toString(nodoGetCount()).contains("9")){ //nodoGetCount -- Metodo para saber cuantos nodos hay
            
            size = size+10;
            
        }
        
        return true;
    }
    
    /**
     * <h1>nodoGetCount</h1>
     * <p>
     * Regresa el numero de nodos existentes en la lista.</p>
     *
     * @return int: numero de nodos
     */
    public int nodoGetCount(){
        
        int cont = 0;
        
        Nodo aux = cabeza;
        
        while(aux != null){
            
            aux = aux.getSig();
            cont++;
            
        }
        
        return cont;
    }
    
    /**
     * <h1>dosMenores</h1>
     * <p>
     * Regresa un string con los dos valores menores de la lista.</p>
     *
     * @return String: dos valores menores de la lista
     */
    public String dosMenores(){
        
        String resultado;
        
        Nodo aux = cabeza;
        
        for(int i = 0; i < nodoGetCount(); i++){
            
            for(int j = 0; j < nodoGetCount(); j++){
                
                if(aux.getDato().compareTo(aux.getSig().getDato()) > 1){
                    
                    Nodo temporal = aux.getSig();
                    temporal.setSig(aux.getSig());
                    aux.setSig(temporal);
                    
                }
                
            }
        
            
        }
        
        resultado = "Menor: [" + cabeza.getDato() + "], Segundo menor: [" + cabeza.getSig().getDato()+"]";
        
        return resultado;
    }
    
    public boolean invertirLista(){
        
        Nodo aux = cabeza;
        
        for(int i = 0; i < nodoGetCount(); i++){
            
            if(aux == null){
                break;
            }else{
                
                Nodo temp = aux.getSig();
                aux.setSig(temp.getSig());
                temp.setSig(aux);
                
                
            }
            
            aux = cabeza;
            
        }
        
        return true;
    }
    
}
