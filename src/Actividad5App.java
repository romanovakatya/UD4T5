
public class Actividad5App {

	public static void main(String[] args) {
		
		// declaración de las variables,
        int A = 65;
        int B = -36987;
        int C = 9;
        int D = 11;
        
        //B tome el valor de C
        System.out.println("B tome el valor de C:");
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        B = C;
        System.out.println("B = " + B);
        
        //C tome el valor de A
        System.out.println("C tome el valor de A:");
        System.out.println("C = " + C);
        System.out.println("A = " + A);        
        C = A;
        System.out.println("C = " + C);
        
        //A tome el valor de D
        System.out.println("A tome el valor de D:");
        System.out.println("A = " + A);
        System.out.println("D = " + D);
        A = D;
        System.out.println("A = " + A);
        
        //D tome el valor de B
        System.out.println("D tome el valor de B:");
        System.out.println("D = " + D);
        System.out.println("B = " + B);
        D = B;
        System.out.println("D = " + D);
	}

}
