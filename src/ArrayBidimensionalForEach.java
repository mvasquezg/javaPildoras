
public class ArrayBidimensionalForEach {

	public static void main(String[] args) {
		//Declarando el array bidemenciinal
		int [][] arrayBidemensional= {
										{10, 8, 15, 19, 21},
										{1, 28, 35, 49, 71},
										{11, 38, 45, 89, 91},
										{12, 68, 85, 79, 71},
									 };
		
		//impriemndo el arreglo con bluce for
		/*for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("Valor almacenado en la posicion "+i+", "+j+": "+arrayBidemensional[i][j]);
			}
			System.out.println();
					
		}*/
		
		for(int [] fila:arrayBidemensional) {
			System.out.println();
			for(int z:fila) {
				System.out.print(z+" ");
			}
		}
		
	}//end main

}//end ArrayBidimensionalForEach
