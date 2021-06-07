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
	
	public String getDataFurgoneta() {
		return "La capacidad de carga es: "+extraCapacity+" y los asientos adicionales son: "+extraAsientos+"\n";
	}//end getDataFurgoneta
	
	
}//end Camioneta
