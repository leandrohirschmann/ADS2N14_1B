import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String you = ""; 
		System.out.println("Quem é você ???");
		you = ler.next();
		System.out.print("Hello "+you+"!!!!");

	}

}
