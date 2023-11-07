package figuras_geometricas;

import java.util.Random;
import java.util.Scanner;

public class Figuras_geometricas {


    static int trianguloA(double base, double altura) {
        return (int) ((base * altura) / 2);
    }

    static int trianguloP(double base, double altura) {
        double base2, lado;
        base2 = base / 2;
        lado = Math.sqrt(Math.pow(base2, 2) + Math.pow(altura, 2));
        return (int) (base + lado + lado);
    }

    static int rectanguloA(double base, double altura) {
        return (int) (base * altura);
    }

    static int rectanguloP(double base, double altura) {
        return (int) (base + altura) * 2;
    }

    static int trapecioA(double base, double altura, double Base) {
        return (int) ((Base + base) * altura) / 2;
    }

    static int trapecioP(double base, double altura, double Base) {
        double base2 = (Base - base) / 2;
        double lado = Math.sqrt(Math.pow(base2, 2) + Math.pow(altura, 2));
        return (int) (Base + base + (lado) * 2);
    }

    static int hexagonoP(double base) {
        return (int) (base * 6);
    }

    static int hexagonoA(int base, int altura) {
        int apotema = altura / 2;
        return (int) ((hexagonoP(base) * apotema) / 2);

    }

    static String rndchar(int num) {
        String relleno = "%";
        Random rnd = new Random();
        num = rnd.nextInt(5);
        num++;
        switch (num) {
            case 1:
                return "*";

            case 2:
                return "$";

            case 3:
                return "@";

            case 4:
                return "&";

            case 5:
                return "€";
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, Base, base = 0, altura = 0;
        String relleno;
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
            if (menu > 4 || menu < 0) {
                System.out.println("¡Ese número no es valido!");
            } else if (menu == 0) {
                System.out.println("Saliendo......");
            } else {
                System.out.println("Dame la base : ");
                base = sc.nextInt();
                System.out.println("Dame la altura : ");
                altura = sc.nextInt();
            }
            relleno = rndchar(1);
            switch (menu) {
                case 1:
                    System.out.println("Área -> " + trianguloA(base, altura));
                    System.out.println("Perímetro -> " + trianguloP(base, altura));
                    int rell = -1;
                    for (int i = 1; i <= altura; i++) {
                        rell = rell + 2;
                        for (int b = altura; b > i; b--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= rell; j++) {
                            System.out.print(relleno);
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Área -> " + rectanguloA(base, altura));
                    System.out.println("Perímetro -> " + rectanguloP(base, altura));
                    for (int i = 1; i <= altura; i++) {
                        for (int j = 1; j <= base; j++) {
                            System.out.print(relleno);
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Dame la Base del Trapecio: ");
                    Base = sc.nextInt();
                    System.out.println("Área -> " + trapecioA(base, altura, Base));
                    System.out.println("Perímetro -> " + trapecioP(base, altura, Base));
                    for (int i = 1; i <= altura; i++) {
                        for (int b = altura; b > i; b--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= base; j++) {
                            System.out.print(relleno);
                        }
                        System.out.println("");
                        base = base + 2;
                    }
                    break;
                case 4:
                    System.out.println("Área -> " + hexagonoA(base, altura));
                    System.out.println("Perímetro -> " + hexagonoP(base));
                    for (int i = 1; i <= altura; i++) {
                        for (int b = altura; b > i; b--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= base; j++) {
                            System.out.print(relleno);
                        }
                        System.out.println("");
                        base = base + 2;
                    }
                    base = base - 4;
                    for (int i = 1; i < altura; i++) {
                        for (int b = 1; b <= i; b++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= base; j++) {
                            System.out.print(relleno);
                        }
                        System.out.println("");
                        base = base - 2;
                    }
                    break;
            }

        } while (menu != 0);

    }

}
