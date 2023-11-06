package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
    int radio;
    float pi = 3.14f;
    Scanner sc = new Scanner(System.in);
        System.out.println("Dame el valor del radio: ");
        radio = sc.nextInt();
        System.out.println("La longitud es: " + 2*pi*radio); 
        System.out.println("El area es " + radio*radio*pi);
    }
    
}
