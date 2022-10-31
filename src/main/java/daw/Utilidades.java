/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package daw;

/**
 *
 * @author noelia
 */
public class Utilidades {

    public static void main(String[] args) {
        //metodo leer entero sin errores
        //metodo leer entero en un rango
        //metodo compararEnteroRango
        //metodo generar aleatorio rango
        
        
        
        //cosas
        
        //recibe tres int, el primero es el numero que quiero comprobrar
        //el segundo es el rango minimo y el tercero el maximo
        private static boolean comprobarRango (int numero, int min, int max) {
            boolean resultado = false;
            
            if (numero>=min&&numero<=max) {
                resultado = true;
            }
            
            return resultado;
            
        }
        
    }
}
