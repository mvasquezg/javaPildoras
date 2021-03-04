import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int edad;
		
		System.out.print("Introduce la edad: ");
		edad=in.nextInt();
		
		/*if(edad>=18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}*/
		
		//Usando else if
		if(edad<18) {
			System.out.println("Eres un adolescente");
		}else if(edad<40) {
			System.out.println("Eres un Joven");
		}else if(edad<65) {
			System.out.println("Eres un Maduro");
		}else {
			System.out.println("Cuidate");
		}
	}//end main

}//end CondicionalIf
