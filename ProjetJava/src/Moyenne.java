import java.util.Scanner;

public class Moyenne {
static double n1,n2,n3,resultat;
	public static void main(String[] args) {
		lire();
		calc(n1,n2,n3);
		afficher();
	}
	public static void afficher() {
	System.out.println("La moyenne de "+n1+" et "+n2+" et "+n3+" est "+resultat);
		
	}
	public static void lire() {
	System.out.println("Entrer les 3 chiffres");
	Scanner sc=new Scanner(System.in);
	n1=sc.nextDouble();
	n2=sc.nextDouble();
	n3=sc.nextDouble();
	sc.close();
	}
	
	public static double calc(double n1,double n2,double n3) {
		resultat=(n1+n2+n3)/3;
		return resultat;
	}
	
	
}
