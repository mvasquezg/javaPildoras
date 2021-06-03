package Empleado;

public class PruebaEmpleadoApp {

	public static void main(String[] args) {
		//PruebaEmpleado empleado01=new PruebaEmpleado("Miguel", 1);
		//PruebaEmpleado empleado02=new PruebaEmpleado("Carolina", 2);
		
		
		PruebaEmpleado empleado01=new PruebaEmpleado("Miguel");
		PruebaEmpleado empleado02=new PruebaEmpleado("Carolina");
		PruebaEmpleado empleado03=new PruebaEmpleado("Paola");
		
		
		empleado01.changeSection("RRHH");
		
		//empleado01.changeName("Rogelio");
		
		System.out.println(empleado01.getData()+"\n");
		//PruebaEmpleado.idEmployed++;
		System.out.println(empleado02.getData());
		System.out.println(empleado03.getData());
		
	}//end main

}//end PruebaEmpleadoApp
