import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		String n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		n = sc.next();
		for (int i = 0; i < a; i++) {
			sum += Character.getNumericValue(n.charAt(i));
		}
		
		System.out.println(sum);

	}

}
