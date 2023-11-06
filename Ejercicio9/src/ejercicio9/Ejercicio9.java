
package ejercicio9;

import java.util.Scanner;


public class Ejercicio9 {


    public static void main(String[] args) {
        String dia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana para saber el ejercicio correspondiente: ");
        dia = sc.nextLine();
            switch(dia){
                case "Lunes":
                    System.out.println("psicomotricidad");
                    break;
                    
                case "Martes":
                    System.out.println("natación");
                    break;        
            
                case "Miércoles":
                    System.out.println("música");
                    break;
            
                case "Jueves":
                    System.out.println("natación");
                    break;
            
                case "Viernes":
                    System.out.println("psicomotricidad");
                    break;        
            
                case "Sábado":
                    System.out.println("Día sin actividades");
                    break;
            
                case "Domingo":
                    System.out.println("Día sin actividades");
                    break;
                default:
                    System.out.println("Día incorrecto");      
            }
    }
    
}
