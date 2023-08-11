/*
 */
package mis_apuntes;

/**
 *
 * @author desarrollo
 */
public class Listas {
    public static void main(String[] args) {
        String[] names = {"Maria", "Juan", "Andres", "Luisa"};
        
        System.out.println("----------------------------------------------------------");
        
        System.out.println("El elemento en la posición 0 es: " + names[0]);
        System.out.println("El elemento en la posición 1 es: " + names[1]);
        System.out.println("El elemento en la posición 2 es: " + names[2]);
        System.out.println("El elemento en la posición 3 es: " + names[3]);
        
        System.out.println("----------------------------------------------------------");
        
        for (int i = 0; i < names.length; i++) {
            System.out.println("El elemento en la posición " + i + " es: " + names[i]);
        }
        
        System.out.println("----------------------------------------------------------");
        
        for(String name : names){
            System.out.println(name);
        }
        
    }
}
