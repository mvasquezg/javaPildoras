import java.util.Scanner;
import javax.swing.JOptionPane;

public class UsoSwitch {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int opcion;
		double base, altura;
		
		System.out.println("Elija una opcion para calular el area de la figura: ");
		System.out.print("1.-Cuadrado\n2.-Rectangulo\n3.-Triangulo\n4.-Circulo\nElija su opcion: ");
		opcion=in.nextInt();
		
		
		
		switch(opcion) {
			case 1:
					base=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del cuadrado: "));
					System.out.printf("El area del cuadrado es igua a: %1.2f", (base*base));
				break;
			case 2:
				base=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del rectangulo: "));
				altura=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del rectangulo: "));
				System.out.printf("El area del rectangulo es igua a: %1.2f", (base*altura));
				break;
			case 3:
				base=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del triangulo: "));
				altura=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del triangulo: "));
				System.out.printf("El area del triangulo es igua a: %1.2f", ( (base*altura)/2));
				break;
			case 4:
				base=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del circulo: "));
				System.out.printf("El area del circulo es igua a: %1.2f", (base*base*Math.PI));
				break;
			default:
					System.out.println("Opcion no valida.");
				break;
		}//end switch
		
		
	}//end main

}//end UsoSwitch
