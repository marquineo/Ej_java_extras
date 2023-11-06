
package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        int X = 5;
        int Y = 15;
        double N = 20.6;
        double M = 25.3;
        double OP;
        System.out.print("Los valores de cada variables son: \n"
                + "X = "+X+"\n"
                + "Y = "+Y+"\n"
                + "N = "+N+"\n"
                + "M = "+M+"\n");
        OP = X+Y;
        System.out.println("X + Y = "+OP);
        OP = M/N;
        System.out.println("M / N = "+OP);
        OP = M-Y;
        System.out.println("M - Y = "+OP);
        OP = N*X;
        System.out.println("N * X = "+OP);
    }
    
}
