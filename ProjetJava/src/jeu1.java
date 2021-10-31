import java.util.Random;
import java.util.Scanner;

public class jeu1 {

	public static void main(String[] args) {
		Random rd=new Random();
		int valeurRd=rd.nextInt(101);
		int val=0,compteur=1;
		System.out.println(valeurRd);	//test
		do {
			System.out.println("Devinez le chiffre saisie");
			Scanner sc=new Scanner(System.in); 
			val=sc.nextInt(); 
			 if(val>valeurRd) { 
				 System.out.println("La valeur saisie est plus grande");
				 compteur+=1;
				 
			 } 
			 if(val<valeurRd) {
			 System.out.println("La valeur saisie est plus petite"); 
			 compteur+=1;
			 } 
			 if(valeurRd==val) {
			 System.out.println("Bravo, vous avez devinez juste au bout de "
			 +compteur+" tentative(s)");
			 }
			 sc.close();
			 }while(valeurRd!=val);
		
		/*
		 * if(valeurRd>val) { System.out.println("La valeur saisie est plus grande");
		 * val=sc.nextInt(); compteur+=1; } if(valeurRd<val) {
		 * System.out.println("La valeur saisie est plus petite"); compteur+=1;
		 * val=sc.nextInt(); } if(valeurRd==val) {
		 * System.out.println("Bravo, vous avez devinez juste au bout de "
		 * +compteur+" tentative(s)");
		 * 
		 * }
		 */
	}
}
