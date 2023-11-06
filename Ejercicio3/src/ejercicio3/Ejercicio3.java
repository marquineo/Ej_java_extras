
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

    
    public static void main(String[] args) {
        int num;
        int suma = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("dame un número: ");
            num = sc.nextInt();
            suma = num + suma;
            i++;
        }
        while (i != 10);
        System.out.println("La suma de todos los números dados es: "+ suma);
    }
    
}
