/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author findag
 */
public class Hilo extends Thread
{
    
    public Hilo(String nombre)
    {
        super(nombre);
    }
    
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Esta es la iteracion " + i + " del " + getName());
            
            try
            {
                // Dormimos el proceso para poder ver como mas facilidad si respeta la espera.
                sleep(100);
                
                //Usamos yield() para dejar paso a la iteracion del otro hilo.
                yield();
            }
            catch (InterruptedException ex)
            {
                System.out.println("Error " + ex);
            }
        }
    }
}
