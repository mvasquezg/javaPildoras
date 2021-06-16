package Empleado;

public class EmpleadoApp {

	public static void main(String[] args) {
		/*Empleado empleado01=new Empleado("Carolina Garcia", 85000, 1990, 12, 17);
		
		Empleado empleado02=new Empleado("Miguel Vasquez", 95000, 1995, 06, 02);
		
		Empleado empleado03=new Empleado("Paola", 105000, 2003, 03, 15);
		
		empleado01.setIncrementarSueldo(5);
		
		empleado02.setIncrementarSueldo(5);
		
		empleado03.setIncrementarSueldo(5);
		
		System.out.println("Nombre: "+empleado01.getNombreEmpleado()+
						   	"\nSueldo: "+empleado01.getSueldoEmpleado()+
						   	"\nFecha Alta: "+empleado01.getAltaContrato()
						  );
		
		System.out.println("\nNombre: "+empleado02.getNombreEmpleado()+
			   	"\nSueldo: "+empleado02.getSueldoEmpleado()+
			   	"\nFecha Alta: "+empleado01.getAltaContrato()
			  );
		
		System.out.println("\nNombre: "+empleado03.getNombreEmpleado()+
			   	"\nSueldo: "+empleado01.getSueldoEmpleado()+
			   	"\nFecha Alta: "+empleado01.getAltaContrato()
			  );*/
		
		//Creando Instancia de Jefatuira
		Jefatura jefeRH=new Jefatura("Juan", 55000, 2000, 9, 25);
		
		jefeRH.setIncentivo(2570);
		
		
		//Creando arreglo de objetos empleado
		Empleado [] arrayEmpleados=new Empleado[6];
		
		arrayEmpleados[0]=new Empleado("Carolina Garcia", 85000, 1990, 12, 17);
		
		arrayEmpleados[1]=new Empleado("Miguel Vasquez", 95000, 1995, 06, 02);
		
		arrayEmpleados[2]=new Empleado("Paola", 105000, 2003, 03, 15);
		
		arrayEmpleados[3]=new Empleado("Ximena");
		
		arrayEmpleados[4]=jefeRH;//Polimorfismo en accion, Principio de sustitucion;
		
		arrayEmpleados[5]=new Jefatura("Maria", 95000, 1999, 05, 26);
		
		//Casting de Objetos
		Jefatura jefeFinanzas=(Jefatura) arrayEmpleados[5];
		jefeFinanzas.setIncentivo(55000);
		
		//Error 
		/// No se puede hacer casting Jefatura jefeFinanzaas=(Jefatura) arrayEmpleados[1];
	
		
		
		//Bucle For para incrementar sueldo 
		/*for(int i=0; i<arrayEmpleados.length; i++) {
			arrayEmpleados[i].setIncrementarSueldo(5);
		}
		
		for(int i=0; i<arrayEmpleados.length; i++) {
			System.out.println("Nombre: "+arrayEmpleados[i].getNombreEmpleado()+
				   	"\nSueldo: "+arrayEmpleados[i].getSueldoEmpleado()+
				   	"\nFecha Alta: "+arrayEmpleados[i].getAltaContrato()+"\n"
				  );	
		}*/
		
		//Bucle for each
		for(Empleado e: arrayEmpleados) {
			e.setIncrementarSueldo(5);
		}
		
		for(Empleado e: arrayEmpleados) {
			System.out.println("Nombre: "+e.getNombreEmpleado()+
				   	"\nSueldo: "+e.getSueldoEmpleado()+
				   	"\nFecha Alta: "+e.getAltaContrato()+"\n"
				  );	
		}
	}//end main

}//end EmpleadoApp
