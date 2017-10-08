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
public class NodoEntero {
    
    private NodoEntero sig;
    private int dato;

    public NodoEntero(int dato) {
       
        this.dato = dato;
        
    }

    public NodoEntero getSig() {
        return sig;
    }

    public void setSig(NodoEntero sig) {
        this.sig = sig;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
}
