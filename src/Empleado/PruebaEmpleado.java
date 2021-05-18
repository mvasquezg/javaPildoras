package Empleado;

public class PruebaEmpleado {
	
	private final String name;
	private String section;
	
	public PruebaEmpleado(String name) {
		this.name=name;
		this.section="Administracion";
	}//end constructor

	public String getName() {
		return name;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/
	
	public void changeSection(String section) {
		this.section=section;
	}
	
	public String getData() {
		return "El nombre es: "+this.name+"\nLa seccion es: "+this.section+"\n";	
	}//end getData
		
	/*public void changeName(String name) {
		this.name=name;
	}*/
}
