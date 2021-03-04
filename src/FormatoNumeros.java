import javax.swing.JOptionPane;

public class FormatoNumeros {

	public static void main(String[] args) {
			/*double numero=1000.00;
			
			System.out.println(numero/3);
			
			System.out.printf("%1.2f\n",numero/3);
			*/
		
		double numero=Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero: "));
		
		System.out.printf("%1.2f", Math.sqrt(numero));
	}//end main

}//end FormatoNumeros
