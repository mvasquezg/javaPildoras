import java.util.Scanner;
	
public class AdivinaNumero {

	public static void main(String[] args) {
		//NUmero aleatorio entre 0 y 100
		//System.out.println(Math.random()*100);
		Scanner in= new Scanner(System.in);
		
		int numAleatorio=(int) (Math.random()*100);
		
		
		//System.out.println(numAleatorio);
		
		int numero=0;
		int intentos=0;
		
		while(numero!=numAleatorio) {
			intentos++;
			System.out.print("Ingresa un numero aleatorio: ");
			numero=in.nextInt();
			
			
			if(numAleatorio<numero) {
				System.out.println("El numero introuducido debe ser mas bajo.");	
			}else if(numAleatorio>numero) {//end if
				System.out.println("El numero introuducido debe ser mas alto.");
			}
			
		}//end while
		
		System.out.println("Correcto. Lo has conseguido en: "+intentos+" intentos");
	}//end main
}//end Adivina Numero
