import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int a,b;
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #"+i+": "+ (a+b));
		}

	}

}