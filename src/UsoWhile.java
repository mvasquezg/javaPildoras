import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args) {
		String clave="Juan";
		
		String pass="";
		
		
		while(clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Introduce la contrasenha: ");
			
			if(clave.equals(pass)==false) {
				System.out.println("Contrasenha incorrecta.");
			}
		}//end while
		
		System.out.println("Acceso permitido.");

	}//end main

}//end UsoWhile
