package vehiculo;

//import javax.swing.JOptionPane;

public class CocheApp {

	public static void main(String[] args) {
	/*	Coche renault=new Coche();
		
		//System.out.println("Este choche tiene: "+renault.ruedas+" ruedas.");
		//renault.setColor("Amarillo");
		renault.setColor(JOptionPane.showInputDialog("Ingrese el color del Coche"));
		
		//System.out.println(renault.getLargo()+renault.getColor());
		
		System.out.println(renault.getDatosGenerales());
		

		System.out.println(renault.getColor());
		
		//renault.setConfigurarAsienTiene asientos de Cuero?tos("Si");
		renault.setConfigurarAsientos(JOptionPane.showInputDialog("Tiene asientos de Cuero?"));
		
		System.out.println(renault.getAsientos());
		
		//renault.setAireAcondicionado("Si");
		renault.setAireAcondicionado(JOptionPane.showInputDialog("Tiene Aire acondicionado?"));
		
		System.out.println(renault.getAireAcondicionado());
		
		
		System.out.println(renault.getPesoTotalCoche());
		
		System.out.println("El precio del carro es: "+renault.getPrecioCoche());
		*/
		
		
		//Instancias muevas con herencia
		Coche auto01=new Coche();
		auto01.setColor("Amarillo");
		
		//Camioneta aplicanco la herencia
		Camioneta camioneta01=new Camioneta(580, 7);
		camioneta01.setColor("Rojo");
		camioneta01.setConfigurarAsientos("Si");
		camioneta01.setAireAcondicionado("Si");
		
		System.out.println("Coche: \n"+auto01.getDatosGenerales()+" "+auto01.getColor());
		System.out.println("Camioneta: \n"+camioneta01.getDatosGenerales()+"\n"+camioneta01.getDataFurgoneta());
		
		
		
		
	
	}//end main

}//end CocheApp
