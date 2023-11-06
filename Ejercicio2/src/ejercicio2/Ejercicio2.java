
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dame un numero: ");
            n1 = sc.nextInt();
            System.out.println("Dame otro numero: ");
            n2 = sc.nextInt();
            }
        while (n1 != n2);
        }
}

