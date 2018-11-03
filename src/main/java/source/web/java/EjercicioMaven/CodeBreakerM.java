package source.web.java.EjercicioMaven;
import java.util.Scanner;


public class CodeBreakerM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "";
		String num = "";
		CodeBreaker codeBreaker = new CodeBreaker();
		while(!result.equals("xxxx")){
			System.out.println("Ingrese un número");
	        Scanner in = new Scanner (System.in); 
	        num = in.nextLine();
			result = codeBreaker.guess(num);
			System.out.println(result);	
		}
		
		
	}

}
