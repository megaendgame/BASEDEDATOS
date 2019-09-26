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
public class TestModificar {

    public TestModificar() {
    }
    
    
    
   @Test
    public void testModificar(){
        System.out.println("Modificar");
        Libro libro=new Libro ("lib001", "titulo","Autor");
        ColeccionLibros instance = new ColeccionLibros();
        instance.Agregar(libro);
        boolean esperado = true;
        boolean obtenido = instance.Modificar(libro);
        Assert.assertEquals(esperado, obtenido);
        
    }
}
