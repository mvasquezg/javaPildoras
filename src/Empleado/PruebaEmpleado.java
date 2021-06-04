package Empleado;

public class PruebaEmpleado {
	
	private final String NAME;//Constante
	private String section;
	//public static int idEmployed;
	private int idEmployed;
	private static int idSiguiente=1;
	
	
	/*public PruebaEmpleado(String name, int idEmployed) {
		this.NAME=name;
		this.section="Administracion";
		this.idEmployed=idEmployed; //Se agrega el idEmpleaod
	}//end constructor*/
	
	public PruebaEmpleado(String name) {
		this.NAME=name;
		this.section="Administracion";
		this.idEmployed=this.idSiguiente; 
		
		this.idSiguiente++;
	}//end constructor

	public String getName() {
		return NAME;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/
	
	public void changeSection(String section) {
		this.section=section;
	}
	
	//MEtodo estatic 
	public static String returnIdNExt() {
		
		return "El idSiguiente es: "+idSiguiente;
	}
	
	
	public String getData() {
		return "El numero de empleado: "+this.idEmployed+"\nNombre: "+this.NAME+"\nLa seccion es: "+this.section+"\n";	
	}//end getData
		
	/*public void changeName(String name) {
		this.name=name;
	}*/
}
