
public class Jeu {

	public static void main(String[] args) {
		int compteur=0;
		
		for(int i=20;i>=0;i--) {
			if(i/10!=0) {
				System.out.print(i+" ");
				compteur+=1;		
			}else {
				System.out.print(" "+i+" ");
				compteur+=1;	
			}

			
			if(compteur == 3) {
				System.out.println();
				compteur=0;
			}	
				
			}
			
	
	}

}
