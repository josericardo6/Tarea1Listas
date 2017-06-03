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
     * Metodo que muestra la lista de datos.</p>
     *
     * @return String: Lista de datos
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
     * Metodo que agrega un numero al final de la lista.</p>
     *
     * @param dato el numero a guardar
     * @return boolean: el resultado de la operacion
     */
    public boolean add(String dato){
        
        Nodo nuevo = new Nodo(dato);
        
        try{
            
            if(cabeza == null){

                cabeza = nuevo;
                ultimo = nuevo;

            }else{

                ultimo.setSig(nuevo);
                ultimo = nuevo;

            }

            agregarEspaciosLista();

            return true;
        
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            return false;
            
        }
        
    }
    
    /**
     * <h1>agregarEspaciosLista</h1>
     * <p>
     * Metodo que agrega 10 espacios a la lista cuando solo le queda un espacio.</p>
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
     * Metodo que regresa el numero de nodos existentes en la lista.</p>
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
     * Metodo que regresa un string con los dos valores menores de la lista.</p>
     *
     * @return String: dos valores menores de la lista
     */
    public String dosMenores(){
        
        String resultado;

        Nodo aux = cabeza;
        String temp = " ";
        String menor1 = " ";
        String menor2 = " ";
        
        if(cabeza == null){
            
            resultado = "La lista esta vacia";
            return resultado;
            
        }else{
            
        
            for(int i = 0; i < nodoGetCount(); i++){ //nodoGetCount da el numero de nodos

//                System.out.println("Lista: "+aux.getDato());

                if(" ".equals(menor1) || " ".equals(menor2)){  // si estan vacios los inicializa en aux

                    menor1 = aux.getDato();
                    menor2 = aux.getDato();

                }else if(menor1.compareTo(aux.getDato()) > 0 ){ // si no estan vacios, compara menor1 con aux(aux se va corriendo) 

                    menor1 = aux.getDato(); // si se da la condicion, se guarda el menor
//                    System.out.println("Menor1: "+menor1);

                    if(menor2.compareTo(menor1) > 0 ){                  //condicion para el segundo menor
                                                                        //menor2 sea mayor a menor1 y menor2 sea menor a aux                                                 
                        menor2 = temp;
//                        System.out.println("Menor2: "+menor2);

                    }

                } 

                temp = aux.getDato();
                aux = aux.getSig();

            }
        
        }    
        
        resultado = "Menor: [" + menor1 + "], Segundo menor: ["+menor2+"]";
        
        return resultado;
    }
    
    /**
     * <h1>invertirLista</h1>
     * <p>
     * Metodo que invierte todos los valores de la lista(Posicion).</p>
     *
     * @return boolean: el resultado de la operacion
     */
    public boolean invertirLista(){
        
        Nodo aux = cabeza;
        Nodo temp;
        
        if(cabeza == null){
            
            return false;
        
        } else{
        
        while (aux.getSig() != null) {

            temp = aux.getSig();  

            aux.setSig(temp.getSig());

            temp.setSig(cabeza);

            cabeza = temp;

           }
        }
        return true;
    }
    
}
