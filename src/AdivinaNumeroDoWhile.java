import java.util.Scanner;

public class AdivinaNumeroDoWhile {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		int numAleatorio=(int) (Math.random()*100);
		int numero=0;
		int intentos=0;
				
		do{
			intentos++;
			System.out.print("Ingresa un numero aleatorio: ");
			numero=in.nextInt();
					
			if(numAleatorio<numero) {
				System.out.println("El numero introuducido debe ser mas bajo.");	
			}else if(numAleatorio>numero) {//end if
				System.out.println("El numero introuducido debe ser mas alto.");
			}
		}while(numero!=numAleatorio);//end while
				
				System.out.println("Correcto. Lo has conseguido en: "+intentos+" intentos");
	}//end main
}//end AdivinaNumeroDoWhile
