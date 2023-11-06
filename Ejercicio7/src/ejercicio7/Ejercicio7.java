
package ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {

    
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad;
        int op = 0;
        float pi = 3.14f;
        System.out.println("Dame el radio del circulo");
        rad = sc.nextInt();
        System.out.print("1. Calcular diámetro \n" 
                + "2. Calcular circunferencia \n"
                + "3. Calcular área \n"
                + "Elige una opción \n");
        op = sc.nextInt();
        if (op == 1){
            rad = rad * 2;
            System.out.println("El diámetro es igual a "+ rad);
            
        
        }else if (op == 2){
            rad = pi * 2 * rad;
            System.out.println("El diámetro es igual a " + rad);
        
        }else if (op == 3){
            rad = rad * rad * pi;
            System.out.println("El diámetro es igual a " + rad);
        
        }else{
            System.out.println("Elige una opción válida");
        }
    }
    
}
