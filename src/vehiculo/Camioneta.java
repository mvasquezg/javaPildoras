package vehiculo;

public class Camioneta extends Coche{//hereda de la clase coche con la palabra extends
	
	private int extraCapacity;
	private int extraAsientos;
	
	//Constructor
	public Camioneta(int extraCapacity, int extraAsientos) {
		super(); //llamar al constructor de la clase padre que es el coche
	
		this.extraCapacity=extraCapacity;
		this.extraAsientos=extraAsientos;
	}
}//end Camioneta
