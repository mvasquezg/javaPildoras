//import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDatos {

	public static void main(String[] args) {
		/*Scanner in=new Scanner(System.in);
		String nombre;
		int edad;
		
		System.out.print("Ingresa tu nombre: ");
		nombre=in.nextLine();
		
		System.out.print("Ingresa tu Edad: ");
		edad=in.nextInt();
		
		System.out.println("Hola "+nombre+" el anho que viene tendras: "+(edad+1)+" anhos");*/
		
		//Video 15 Usando JOPTIONEPANE
		String nombre;
		int edad;
		
		nombre=JOptionPane.showInputDialog("Introduce tu nombre: ");
		edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));
		
		System.out.println("Tu nombre es: "+nombre+" el anho que viene tendras: "+(edad+1));
		
	}//end main

}//end EntradaDatos
