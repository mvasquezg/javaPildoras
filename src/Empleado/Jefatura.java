package Empleado;

public class Jefatura extends Empleado {
    private double incentivo; 
	
	
	public Jefatura(String nombreJefe, double sueldoJefe, int anho, int mes, int dia) {
		super(nombreJefe, sueldoJefe, anho, mes, dia);
	}
	
	public void setIncentivo(double incentivo) {
		this.incentivo=incentivo;
	}
	
	public double getSueldoEmpleado() {
		double sueldoJefe=super.getSueldoEmpleado();		
		return sueldoJefe+this.incentivo; 
	}
}
