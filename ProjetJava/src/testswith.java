import java.util.Scanner;

public class testswith {

	public static void main(String[] args) {
		int n1,n2,resultat=0,operateur;
		System.out.println("Entrer 2 nombre :");
		try (Scanner sc = new Scanner(System.in)) {
			n1=sc.nextInt();
			n2=sc.nextInt();
			System.out.println("Choisis un operateur :");
			System.out.println("1 pour addition");
			System.out.println("2 pour soustration");
			System.out.println("3 pour multiplication");
			System.out.println("4 pour division");
			operateur=sc.nextInt();
		}
		switch (operateur) {
		case 1: {
			
			resultat=n1+n2;
			break;
			}
		case 2: {
				
				resultat=n1-n2;
				break;
			}
		case 3: {
			
			resultat=n1*n2;
			break;
		}
		case 4: {
			
			resultat=n1/n2;
			break;
		}
	}
		System.out.println("Le resultat est :"+resultat);
}
}
