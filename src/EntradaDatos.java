import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String nombre;
		int edad;
		
		System.out.print("Ingresa tu nombre: ");
		nombre=in.nextLine();
		
		System.out.print("Ingresa tu Edad: ");
		edad=in.nextInt();
		
		System.out.println("Hola "+nombre+" el anho que viene tendras: "+(edad+1)+" anhos");
		
		
	}//end main

}//end EntradaDatos
