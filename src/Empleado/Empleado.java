package Empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	
	private String nombreEmpleado;
	private double sueldoEmpleado;
	private Date altaContrato; //Fecha de contrato
	
	
	public Empleado(String nombreEmpleado, double sueldoEmpleado, int anho, int mes, int dia) {
		
		this.nombreEmpleado=nombreEmpleado;
		this.sueldoEmpleado=sueldoEmpleado;
		
		GregorianCalendar calendario=new GregorianCalendar(anho, (mes-1), dia);
		
		this.altaContrato=calendario.getTime();
		
	}//end Empleado


	public String getNombreEmpleado() {
		return nombreEmpleado;
	}


	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}


	public double getSueldoEmpleado() {
		return sueldoEmpleado;
	}


	public void setSueldoEmpleado(double sueldoEmpleado) {
		this.sueldoEmpleado = sueldoEmpleado;
	}
	
	
	public Date getAltaContrato() {
		return altaContrato;
	}
	
	public void setIncrementarSueldo(double porcentaje) {
		double aumento=this.sueldoEmpleado*(porcentaje/100);
		
		this.sueldoEmpleado+=aumento;
	}
	
}//Empleado
