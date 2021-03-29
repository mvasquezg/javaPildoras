import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		String genero="";
		int altura=0;
		int pesoIdeal=0;
		
		do {
				genero=JOptionPane.showInputDialog("Ingresa tu sexo (H/M): ");
				
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm: "));
		
		if(genero.equalsIgnoreCase("H")) {
			pesoIdeal=altura-110;
		}else if(genero.equalsIgnoreCase("M")) {
			pesoIdeal=altura-120;
		}
		
		System.out.println("Tu peso ideal es: "+pesoIdeal+" kg");
	}//end main

}//end PesoIdeal
