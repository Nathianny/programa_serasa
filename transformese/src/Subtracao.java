import java.util.Scanner;

public class Subtracao {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

	System.out.println("Informe o primeiro número:"); 
	double numero1 = entrada.nextDouble();
	
	System.out.println("Informe o segundo número:");
	double numero2 = entrada.nextDouble();
	
	double resultado = numero1 - numero2;	
	
	System.out.println("A subtração dos números é igual a: " + resultado);
}

}
