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
public class TestEliminar {

    public TestEliminar() {
    }
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String codigo ="lib001";
        Libro libro=new Libro ("lib001", "titulo","Autor");
        ColeccionLibros instance = new ColeccionLibros();
        instance.Agregar(libro);
        boolean esperado = true;
        boolean obtenido = instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);
        
    }
    
}
