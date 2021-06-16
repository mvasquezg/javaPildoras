package Empleado;

public class PruebaEmpleadoApp {

	public static void main(String[] args) {
		//PruebaEmpleado empleado01=new PruebaEmpleado("Miguel", 1);
		//PruebaEmpleado empleado02=new PruebaEmpleado("Carolina", 2);
		
		
		PruebaEmpleado empleado01=new PruebaEmpleado("Miguel");
		PruebaEmpleado empleado02=new PruebaEmpleado("Carolina");
		PruebaEmpleado empleado03=new PruebaEmpleado("Paola");
		PruebaEmpleado empleado04=new PruebaEmpleado("Ximena");
		PruebaEmpleado empleado05=new PruebaEmpleado("Lupe");
		PruebaEmpleado empleado06=new PruebaEmpleado("Martha");
		PruebaEmpleado empleado07=new PruebaEmpleado("Tomas");
		
		
		
		empleado01.changeSection("RRHH");
		
		//empleado01.changeName("Rogelio");
		
		System.out.println(empleado01.getData()+"\n");
		//PruebaEmpleado.idEmployed++;
		System.out.println(empleado02.getData());
		System.out.println(empleado03.getData());
		System.out.println(empleado04.getData());
		System.out.println(empleado05.getData());
		System.out.println(empleado06.getData());
		System.out.println(empleado07.getData());
		System.out.println(PruebaEmpleado.returnIdNExt());
		
		
	}//end main

}//end PruebaEmpleadoApp
