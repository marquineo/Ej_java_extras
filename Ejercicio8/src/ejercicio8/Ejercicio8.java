package ejercicio8;

import java.util.Scanner;


public class Ejercicio8 {

    
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad;
        int op;
        float pi = 3.14f;
        
        
        do {
            System.out.println("Dame el radio del circulo");
        rad = sc.nextInt();
        System.out.print("1. Calcular diámetro \n" 
                + "2. Calcular circunferencia \n"
                + "3. Calcular área \n"
                + "4. Salir\n"
                + "Elige una opción \n");
        op = sc.nextInt();
            switch (op) {
                case 1:
                    rad = rad * 2;
                    System.out.println("El diámetro es igual a "+ rad);
                    break;
                case 2:
                    rad = pi * 2 * rad;
                    System.out.println("El diámetro es igual a " + rad);
                    break;
                case 3:
                    rad = rad * rad * pi;
                    System.out.println("El diámetro es igual a " + rad);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;   
                default:
                    System.out.println("Elige una opción válida");
                    break;
            }
        }while (op != 4);
        
        
        
        
        
        /*     switch (op) {
            case 1:
                rad = rad * 2;
                System.out.println("El diámetro es igual a "+ rad);
                break;
            case 2:
                rad = pi * 2 * rad;
                System.out.println("El diámetro es igual a " + rad);
                break;
            case 3:
                rad = rad * rad * pi;
                System.out.println("El diámetro es igual a " + rad);
                break;
            default:
                System.out.println("Elige una opción válida");
                break;
        }
   */ }
    
}