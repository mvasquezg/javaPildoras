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
   public void setColor(String color) {
	   	//color="Azul";
	   this.color=color;
   }//end setColor
   
   public void setConfigurarAsientos(String asientoCuero) {
	   
	   if(asientoCuero=="Si") {
		   this.asientoCuero=true;
	   }else {
		   this.asientoCuero=false;
	   }
	   
   }//end setConfiguraAsientos
   
   
   //Metodos getter
   public String getDatosGenerales() {
	   return "La plataforma del vehiculo tiene "+ruedas+" ruedas. Mide "+(largo/1000)+" metros con un ancho: "+
   ancho+" y un peso de plataforma de "+pesoPlataforma+" kg.";
   }//end 
   
   public String getAsientos() {
	   
	   if(asientoCuero) {
		   return "El coche tiene asientos de cuero"; 
	   }else {
		   return "El coche tiene asientos de Serie";
	   }
	   
   }
   
   public String getLargo() {
	   return "El largo del coche es: "+largo+" cm\n";
   }//end getLargo
   
   public String getColor() {
	   return "El color del coche es: "+color+"\n";
   }
   
   
   
}
