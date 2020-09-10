import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;	// 입력받은 정수

		int max;	// 최대값
		int count = 0;	// 몇번째 수인지 카운트
		Scanner sc = new Scanner(System.in);
		int n[] = new int[9];

		for (int i = 0; i < 9; i++) {
			n[i] = sc.nextInt();
		}
		max = n[0];
		for (int i = 1; i < 9; i++) {
			if (max <= n[i]) {
				max = n[i];
				count=i;
			}
			
		}
		System.out.println(max);
		System.out.println(count+1);
	}

}