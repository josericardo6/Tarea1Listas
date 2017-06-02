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
 * @author joser
 */
public class ListaSimpleTest {
    
    public ListaSimpleTest() {
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
     * Test of getCabeza method, of class ListaSimple.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        ListaSimple instance = new ListaSimple();
        Nodo expResult = null;
        Nodo result = instance.getCabeza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabeza method, of class ListaSimple.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        Nodo cabeza = null;
        ListaSimple instance = new ListaSimple();
        instance.setCabeza(cabeza);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimo method, of class ListaSimple.
     */
    @Test
    public void testGetUltimo() {
        System.out.println("getUltimo");
        ListaSimple instance = new ListaSimple();
        Nodo expResult = null;
        Nodo result = instance.getUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUltimo method, of class ListaSimple.
     */
    @Test
    public void testSetUltimo() {
        System.out.println("setUltimo");
        Nodo ultimo = null;
        ListaSimple instance = new ListaSimple();
        instance.setUltimo(ultimo);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class ListaSimple.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ListaSimple instance = new ListaSimple();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class ListaSimple.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        ListaSimple instance = new ListaSimple();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaSimple.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaSimple instance = new ListaSimple();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ListaSimple.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String dato = "";
        ListaSimple instance = new ListaSimple();
        boolean expResult = false;
        boolean result = instance.add(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarEspaciosLista method, of class ListaSimple.
     */
    @Test
    public void testAgregarEspaciosLista() {
        System.out.println("agregarEspaciosLista");
        ListaSimple instance = new ListaSimple();
        boolean expResult = false;
        boolean result = instance.agregarEspaciosLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nodoGetCount method, of class ListaSimple.
     */
    @Test
    public void testNodoGetCount() {
        System.out.println("nodoGetCount");
        ListaSimple instance = new ListaSimple();
        int expResult = 0;
        int result = instance.nodoGetCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of dosMenores method, of class ListaSimple.
     */
    @Test
    public void testDosMenores() {
        System.out.println("dosMenores");
        ListaSimple instance = new ListaSimple();
        String expResult = "";
        String result = instance.dosMenores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invertirLista method, of class ListaSimple.
     */
    @Test
    public void testInvertirLista() {
        System.out.println("invertirLista");
        ListaSimple instance = new ListaSimple();
        boolean expResult = false;
        boolean result = instance.invertirLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
