import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;	// 입력받은 정수
		int n[] = new int[42];	// 나머지 저장
		int count = 0;	// 나머지의 갯수
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			a = sc.nextInt();
			n[a % 42] = a % 42;
			if (a % 42 == 0) {
				count = 1;
			}
		}

		for (int i = 1; i < 42; i++) {
			if (n[i] > 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}