package Empleado;

public class PruebaEmpleadoApp {

	public static void main(String[] args) {
		PruebaEmpleado empleado01=new PruebaEmpleado("Miguel");
		PruebaEmpleado empleado02=new PruebaEmpleado("Carolina");
		
		empleado01.changeSection("RRHH");
		
		//empleado01.changeName("Rogelio");
		
		System.out.println(empleado01.getData());
		System.out.println(empleado02.getData());
		
		
		
		
	}//end main

}//end PruebaEmpleadoApp
