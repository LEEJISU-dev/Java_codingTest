import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0; // 고정비용
		int b = 0; // 가변비용
		int c = 0; // 가격
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (b >= c) {
			System.out.println(-1);
		} else {
			System.out.println(a/(c-b)+1);
		}
		
	}

}
