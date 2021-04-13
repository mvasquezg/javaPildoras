import javax.swing.JOptionPane;

public class UsoForEach {

	public static void main(String[] args) {
		/*String [] arrayPaises=new String[8];
		
		arrayPaises[0]="Espana";
		arrayPaises[1]="Mexico";
		arrayPaises[2]="Colombia";
		arrayPaises[3]="EU";
		arrayPaises[4]="chile";
		arrayPaises[5]="Brasil";
		arrayPaises[6]="Peru";
		arrayPaises[7]="Argentina";*/
		
		//For nomal
		/*for(int i=0; i<arrayPaises.length; i++) {
			System.out.println("Pais "+(i+1)+": "+arrayPaises[i]);
		}*/
		
		//Uso del ofr each
		/*String [] arrayPaises= {"Espana","Mexico","Colombia","EU","chile","Brasil","Peru","Argentina"};
		
		//For each
		for(String elemento:arrayPaises) {
			System.out.println(elemento);
		}*/
		
		
		/*String [] arrayPaises=new String[8];
		
		for(int i=0; i<arrayPaises.length; i++) {
			arrayPaises[i]=JOptionPane.showInputDialog("INTRODUCE UN PAIS: ");
		}
		
		for(String elemento:arrayPaises) {
			System.out.println(elemento);
		}*/
		
		
		int[] arrayNumeros=new int[150];
		
		for(int i=0; i<arrayNumeros.length;i++) {
			arrayNumeros[i]=(int) Math.round(Math.random()*100);
			
		}
		
		for(int numeros:arrayNumeros) {
			System.out.println(numeros);
		}
		
		
		
	}

}
