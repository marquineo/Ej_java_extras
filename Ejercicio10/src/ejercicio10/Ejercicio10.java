
package ejercicio10;

import java.util.Scanner;


public class Ejercicio10 {

    public static void main(String[] args) {
        int neg = 0;
        int pos = 0;
        int cer = 0;
        float num;
        int i;
        Scanner sc = new Scanner(System.in);
            for(i = 0;i == 10; i++){
                System.out.println("Dame un número: ");
                num = sc.nextInt();
                if(num < 0){
                neg++;
                }else if(num > 0){
                pos++;
                }else{
                cer++;
                }
            }
        System.out.print("Números introducidos:"
                + "Ceros = " + cer
                + "Positivos = " + pos
                + "Negativos = " + neg);
    }
    
}
