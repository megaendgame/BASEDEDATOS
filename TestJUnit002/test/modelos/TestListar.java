/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author endga
 */


public class TestListar {

    public TestListar() {
    }
    
    @Test
    public void testListar(){
        System.out.println("Listar");
        ColeccionLibros instance = new ColeccionLibros();
        ArrayList<Libro> esperado = new ArrayList<Libro>();
        ArrayList<Libro> obtenido = instance.Listar();
        Assert.assertEquals(esperado, obtenido);
    }
    
}
