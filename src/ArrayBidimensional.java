
public class ArrayBidimensional {

	public static void main(String[] args) {
		
		//Declarando el array bidemenciinal
		int [][] arrayBidemensional=new int[4][5];
		
		//LLenado el array manualmente 
		arrayBidemensional[0][0]=15;
		arrayBidemensional[0][1]=25;
		arrayBidemensional[0][2]=32;
		arrayBidemensional[0][3]=58;
		arrayBidemensional[0][4]=35;
		
		arrayBidemensional[1][0]=4;
		arrayBidemensional[1][1]=26;
		arrayBidemensional[1][2]=45;
		arrayBidemensional[1][3]=51;
		arrayBidemensional[1][4]=12;
		
		arrayBidemensional[2][0]=35;
		arrayBidemensional[2][1]=89;
		arrayBidemensional[2][2]=92;
		arrayBidemensional[2][3]=64;
		arrayBidemensional[2][4]=41;
		
		arrayBidemensional[3][0]=1;
		arrayBidemensional[3][1]=27;
		arrayBidemensional[3][2]=96;
		arrayBidemensional[3][3]=34;
		arrayBidemensional[3][4]=43;
		
		
		//impriemndo elemento del array bidemensional
		//System.out.println("Valor almacbeado en la psocion 2, 3: "+arrayBidemensional[2][3]);
		
		//impriemndo el arreglo con bluce for
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("Valor almacenado en la posicion "+i+", "+j+": "+arrayBidemensional[i][j]);
			}
			System.out.println();
			
		}
		

	}//end main

}//end ArrayBidimensional
