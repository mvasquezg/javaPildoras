import javax.swing.JOptionPane;

public class CompruebaMailFor {

	public static void main(String[] args) {
		//boolean arroba=false;
		int arroba=0;
		boolean punto=false;
		
		String mail=JOptionPane.showInputDialog("Introduce tu mail: ");
		
		
			for(int i=0; i<mail.length(); i++){
				if(mail.charAt(i)=='@') {
					arroba++;
				}
				
				if(mail.charAt(i)=='.') {
					punto=true;
				}
			}
			
			if(arroba==1 && punto==true) {
				System.out.println("EL mail es correcto.");
			}else {
				System.out.println("EL mail no es correcto.");
			}
		
		//System.out.println(mail.length());
	}

}
