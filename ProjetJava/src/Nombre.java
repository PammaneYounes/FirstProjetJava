import java.util.Random;

public class Nombre {
int a;
	public Nombre() {
		Random rd=new Random();
		a=rd.nextInt();	
	}
	public void afficher() {
	System.out.println(a);	
	}

}
