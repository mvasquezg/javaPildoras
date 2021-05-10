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
	   
	   if(asientoCuero.equalsIgnoreCase("si")) {
		   this.asientoCuero=true;
	   }else {
		   this.asientoCuero=false;
	   }
	   
   }//end setConfiguraAsientos
   
   public void setAireAcondicionado(String aireAcondicionado) {
	   if(aireAcondicionado.equalsIgnoreCase("Si")) {
		   this.aireAcondicionado=true;
	   }else {
		   this.aireAcondicionado=false;
	   }
   }//end setAireAcondicionado
   
   
   
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
   
   public String getAireAcondicionado() {
	   
	   if(aireAcondicionado) {
		   return "El coche incorpora clima.";
	   }else {
		   return "El coche no incorpora clima.";
	   }
	   
   }//end getAireAcondicionado
   
   public String getPesoTotalCoche() {
	   int pesoCarroceria=500;
	   
	   this.pesoTotal=this.pesoPlataforma+pesoCarroceria;
	   
	   if(this.asientoCuero) {
		   pesoTotal=pesoTotal+50;
	   }

	   if(this.aireAcondicionado) {
		   pesoTotal=pesoTotal+20;
	   }
	   
	   return "El peso total del coche es: "+pesoTotal;
   }//end getPesoTotalCoche
   
   public int getPrecioCoche() {
	   int precioFinal=10000;
	   
	   if(asientoCuero)	 {
		   precioFinal+=2000;
	   }
	   
	   if(aireAcondicionado==true) {
		   precioFinal+=1500;
	   }
	   return precioFinal;
   }
   

}
