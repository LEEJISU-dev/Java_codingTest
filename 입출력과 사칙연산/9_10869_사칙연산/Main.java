import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A;
		int B;
		 
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		
		System.out.println(A + B);	// 덧셈
		System.out.println(A - B);	// 뺄셈
		System.out.println(A * B);	// 곱셈
		System.out.println(A / B);	// 나눗셈
		System.out.println(A % B);	// 나머지
	}

}