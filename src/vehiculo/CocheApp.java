package vehiculo;

public class CocheApp {

	public static void main(String[] args) {
		Coche renault=new Coche();
		
		//System.out.println("Este choche tiene: "+renault.ruedas+" ruedas.");
		renault.setColor();
		
		System.out.println(renault.getLargo()+renault.getColor());
		
		
		

	}

}
