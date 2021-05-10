package vehiculo;

public class CocheApp {

	public static void main(String[] args) {
		Coche renault=new Coche();
		
		//System.out.println("Este choche tiene: "+renault.ruedas+" ruedas.");
		renault.setColor("Amarillo");
		
		//System.out.println(renault.getLargo()+renault.getColor());
		
		System.out.println(renault.getDatosGenerales());
		

		System.out.println(renault.getColor());
		
		renault.setConfigurarAsientos("Si");
		
		System.out.println(renault.getAsientos());
		
		renault.setAireAcondicionado("Si");
		
		System.out.println(renault.getAireAcondicionado());
		
		
		System.out.println(renault.getPesoTotalCoche());
		
		System.out.println("El precio del carro es: "+renault.getPrecioCoche());
		
	}//end main

}//end CocheApp
