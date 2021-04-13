
public class UsoArray {

	public static void main(String[] args) {
		
		/*Primera forma de declarar una matriz
		int [] matriz= new int[5];
		
		matriz[0]=5;
		matriz[1]=10;
		matriz[2]=15;
		matriz[3]=20;
		matriz[4]=25;
		*/
		
		int [] matriz= {5,10,15,20,25};
		
		/*for(int i=0; i<5; i++) {
			System.out.println("Valor del indice: "+i+" es igual a: "+matriz[i]);
		}//end for*/
		
		for(int i=0; i<matriz.length; i++) {
			System.out.println("Valor del indice: "+i+" es igual a: "+matriz[i]);
		}
		
	}

}
