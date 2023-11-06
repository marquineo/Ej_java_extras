package figuras_geometricas;

import java.util.Scanner;

public class Figuras_geometricas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, Base, base, altura, area, perimetro;
        do {
            System.out.println("Elije una de las figuras :");
            System.out.println("********************");
            System.out.println("1. Triángulo ");
            System.out.println("2. Rectángulo ");
            System.out.println("3. Trapecio ");
            System.out.println("4. Hexágono ");
            System.out.println("0. Salir ");
            System.out.print("-> ");
            menu = sc.nextInt();
            if (menu > 4) {
                System.out.println("¡Ese número no es valido!");
            }
            switch (menu) {
                case 1:
                    System.out.println("Dame la base del triángulo: ");
                    base = sc.nextInt();
                    System.out.println("Dame la altura del triángulo: ");
                    altura = sc.nextInt();
                    area = (base * altura) / 2;
                    perimetro =;
                    break;
                case 2:
                    System.out.println("Dame la base del rectángulo: ");
                    base = sc.nextInt();
                    System.out.println("Dame la altura del rectángulo: ");
                    altura = sc.nextInt();
                    area = base * altura;
                    perimetro = (base + altura) * 2;
                case 3:
                    System.out.println("Dame la base del trapecio: ");
                    base = sc.nextInt();
                    System.out.println("Dame la altura del trapecio: ");
                    altura = sc.nextInt();
                    System.out.println("Dame la Base del trapecio");
                    Base = sc.nextInt();
                    area = ((Base + base) * altura) / 2;
                    perimetro = Base + base + ;
            }

        } while (menu != 0);
    }

}
