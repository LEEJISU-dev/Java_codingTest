import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b = 0;
		int sum = 0;	// 총합계
		double avg = 0;	// 평균
		double per = 0;	// 비율
		int count = 0;	//
		int n[] = new int[1000];	//
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();	// 테스트 케이스의 개수

		for (int i = 0; i < a; i++) {
			b = sc.nextInt();	// 학생 수 
			for (int j = 0; j < b; j++) {
				n[j] = sc.nextInt();	// 학생의 점수
				sum += n[j];	// 총합
			}
			avg = sum / b;
			for (int k = 0; k < b; k++) {
				// 평균 넘는 학생 카운트
				if (avg < n[k]) {
					count++;
				}
			}
			per = (double)count / (double)b * 100;	// 평균을 넘는 학생의 비율
			System.out.println(String.format("%.3f", per)+"%");	// 소수점 세째 자리에서 반올림
			count = 0;
			sum = 0;
			avg = 0;
			per = 0;
		}

	}

}