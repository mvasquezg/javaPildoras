
public class CalculosConMath {

	public static void main(String[] args) {
		
		//Metodo raiz cuadradada
		//double raiz = Math.sqrt(9);
		
		//float num1 = 5.85F;
		//int resultado=Math.round(num1);
		
		//Metodo para redondear round
		/*double num1 = 9.55F;
		int resultado=(int)Math.round(num1);
		
		System.out.println(resultado);*/
		
		//Metodo para calcular exponente
		double base = 5;
		double exponente = 3;
		
		int resultado=(int)Math.pow(base, exponente);
		
		System.out.println("El resultado de "+base+" elevado al "+exponente+" es "+resultado);
		
	}//end main

}//end CalculosConMath
