
package ejercicios_pseudo;

import java.util.Scanner;


public class Ejercicios_pseudo {

    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner sc = new Scanner(System.in);
          System.out.println("Dame el primer número: ");
          n1 = sc.nextInt();
          System.out.println("Dame el segundo número: ");
          n2 = sc.nextInt();
       if (n1>n2){
           System.out.println("El primer número es mayor");
       }else if (n1<n2){
           System.out.println("El segundo número es mayor");
       } else {
           System.out.println("los número son iguales");
       }
    }
}
