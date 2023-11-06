package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        int grados;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una cantidad de grados centígrados: ");
        grados = sc.nextInt();
        grados = 32 + (9 * grados / 5);
        System.out.println("El valor en grados Fahrenheit es " + grados + " ºF");
        
    }
    
}