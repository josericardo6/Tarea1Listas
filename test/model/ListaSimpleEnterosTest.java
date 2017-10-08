/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo Rodriguez
 */
public class ListaSimpleEnterosTest {
    
    public ListaSimpleEnterosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCabeza method, of class ListaSimpleEnteros.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        ListaSimpleEnteros instance = new ListaSimpleEnteros();
        NodoEntero expResult = null;
        NodoEntero result = instance.getCabeza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabeza method, of class ListaSimpleEnteros.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        NodoEntero cabeza = null;
        ListaSimpleEnteros instance = new ListaSimpleEnteros();
        instance.setCabeza(cabeza);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimo method, of class ListaSimpleEnteros.
     */
    @Test
    public void testGetUltimo() {
        System.out.println("getUltimo");
        ListaSimpleEnteros instance = new ListaSimpleEnteros();
        NodoEntero expResult = null;
        NodoEntero result = instance.getUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUltimo method, of class ListaSimpleEnteros.
     */
    @Test
    public void testSetUltimo() {
        System.out.println("setUltimo");
        NodoEntero ultimo = null;
        ListaSimpleEnteros instance = new ListaSimpleEnteros();
        instance.setUltimo(ultimo);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class ListaSimpleEnteros.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ListaSimpleEnteros instance = new ListaSimpleEnteros();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class ListaSimpleEnteros.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        ListaSimpleEnteros instance = new ListaSimpleEnteros();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaSimpleEnteros.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaSimpleEnteros instance = new ListaSimpleEnteros();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ListaSimpleEnteros.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int dato = -1;
        ListaSimpleEnteros instance = new ListaSimpleEnteros();
        boolean expResult = true;
        boolean result = instance.add(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarRepetidos method, of class ListaSimpleEnteros.
     */
    @Test
    public void testEliminarRepetidos() {
        System.out.println("eliminarRepetidos");
        ListaSimpleEnteros instance = new ListaSimpleEnteros();
        boolean expResult = true;
        boolean result = instance.eliminarRepetidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
