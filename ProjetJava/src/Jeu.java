
public class Jeu {

	public static void main(String[] args) {
		int compteur=0;
		for(int i=20;i>=0;i--) {
			
			if(compteur <3) {
				System.out.print(i+" ");	
				compteur+=1;
			}
			
			else {
				i+=1;
				System.out.println();
				compteur=0;
			}
				
		}
	}

}
