import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double A;
		double B;
		double sum = 0;	// 나눗셈 결과
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		sum = A / B;
		System.out.println(sum);

	}

}