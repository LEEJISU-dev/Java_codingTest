import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if (a <= 100 && 90<= a) {
			System.out.println("A");
		} else if (a <= 89  && 80<= a) {
			System.out.println("B");
		} else if (a <= 79 && 70<= a) {
			System.out.println("C");
		}else if (a <= 69 && 60<= a) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}