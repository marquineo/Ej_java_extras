
package ejercicio4;


public class Ejercicio4 {

    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int AUX;
        System.out.print("Los valores iniciales son: \nA= "+A+ 
                                                    "\nB= "+B+
                                                    "\nC= "+C+
                                                    "\nD= "+D);
        AUX=B; B=C;
        C=D; D=AUX;
        AUX=C; C=A;
        A=AUX;
        System.out.print("\nLos valores ahora son: \nA= "+A+ 
                                                "\nB= "+B+
                                                "\nC= "+C+
                                                "\nD= "+D);
        
    }
    
}
