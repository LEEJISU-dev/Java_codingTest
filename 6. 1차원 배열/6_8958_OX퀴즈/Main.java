import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;		// 퀴즈 결과의개수
		int count = 0;	// 연속된 O의 개수
		int sum = 0;	// 점수 합계
		String b;		// 입력받은 OX
		char n[] = new char[80];	// OX를 하나씩 담은 배열
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			b = sc.next();
			
			for (int j = 0; j < b.length(); j++) {
				n[j] = b.charAt(j);	// OX결과를 하나씩 저장
				if (n[j] == 'O') {
					count++;
					sum += count;	// 총합 
				} else {
					count = 0;
				}
			}
			System.out.println(sum);
			sum = 0;
			count = 0;
		}
	}

}