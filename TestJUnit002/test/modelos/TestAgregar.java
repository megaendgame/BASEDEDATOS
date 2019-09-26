/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author endga
 */
public class TestAgregar {

    public TestAgregar() {
    }
    
    
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Libro libro=new Libro ("lib001", "titulo","Autor");
        ColeccionLibros instance = new ColeccionLibros();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(libro);
        Assert.assertEquals(esperado, obtenido);
        
    }
}
