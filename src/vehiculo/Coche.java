package vehiculo;

public class Coche {
   private int ruedas;
   private int largo;
   private int ancho;
   private int motor;
   private int pesoPlataforma;
   private String color;
   private int pesoTotal;
   private boolean asientoCuero, aireAcondicionado;
   
   //Metodo Constructor
   public Coche() {
	   ruedas=4;
	   largo=2000;
	   ancho=300;
	   motor=1600;
	   pesoPlataforma=500;
	   
   }//end Coche
   
 //Metodos setter
   public void setColor() {
	   	color="Azul";
   }//end setColor
   
   //Metodos getter
   public String getLargo() {
	   return "El largo del coche es: "+largo+" cm\n";
   }//end getLargo
   
   public String getColor() {
	   return "El color del coche es: "+color+"\n";
   }
   
}
