/*
 * Programa en java que crea dos hilos y los ejecuta. Los hilos escriben 5 veces 
 * el número de iteración del bucle y su nombre. En cada iteración, después de escribir su nombre,
 * dejan paso al otro hilo (se bloquean utilizando el método yield()).
 */
package repaso4;

/**
 *
 * @author findag
 */
public class Repaso4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Definimos nuestros 2 hilos.
        Hilo hilo1 = new Hilo();
        Hilo hilo2 = new Hilo();
        
        // Iniciamos los hilos
        hilo1.start();
        hilo2.start();
    }
    
}
