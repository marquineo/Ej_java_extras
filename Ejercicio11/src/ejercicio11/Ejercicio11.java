
package ejercicio11;

import java.util.Scanner;


public class Ejercicio11 {

    public static void main(String[] args) {
        int num;
        int i;
        int fac = 1;
        Scanner sc = new Scanner(System.in);
        
            do{
                System.out.println("Dame un número igual o mayor que 0: ");
                num = sc.nextInt();
            }while (num < 0);
            for(i = 1;i <= num;i++){
            fac = i * fac;
            }
            System.out.println("El factorial de " + num + " es " + fac);
    }
    
}
