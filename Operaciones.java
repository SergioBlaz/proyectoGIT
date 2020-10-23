import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
    	int opcion, operando1, operando2, resultado = 0;
    	System.out.print("Introduce un número entero: ");
    	operando1 = teclado.nextInt();
    	teclado.nextLine();
    	System.out.print("Introduce otro número entero: ");
    	operando2 = teclado.nextInt();
    	teclado.nextLine();
    	System.out.println("------- OPERACIONES -------");
    	System.out.println("--                       --");
    	System.out.println("--      1. SUMAR         --");
    	System.out.println("--      2. RESTAR        --");
    	System.out.println("--      3. MULTIPLICAR   --");
    	System.out.println("--      4. DIVIDIR       --");
    	System.out.println("--                       --");
    	System.out.println("---------------------------\n");
    	System.out.println("Introduce una opción: ");
    	opcion = teclado.nextInt();
    	teclado.nextLine();

    	switch(opcion){
    		case 1:
    			resultado = operando1 + operando2;
    			break;
    		case 2:
    			resultado = operando1 - operando2;
    			break;
    		case 3:
    			resultado = operando1 * operando2;
    			break;
    		case 4:
    			resultado = operando1 / operando2;
    			break;
    		default:
    			System.out.println("OPCIÓN INCORRECTA");
    			return;
    	}

    	System.out.println("El resultado es "+resultado);
    }
}
