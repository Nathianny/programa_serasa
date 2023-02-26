package introducao;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
         
         System.out.println("Dia atual"); 
		 int diaAtual = entrada.nextInt();
					
		  System.out.println("Dia do vencimento"); 
			int diaVenc = entrada.nextInt();
					
		  System.out.println("Dias de atraso"); 
			int diasAtraso = entrada.nextInt();
			
             
             entrada.close();
		
	}

}