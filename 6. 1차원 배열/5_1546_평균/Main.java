import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		double max = 0;	// 최댓값
		double sum = 0;	// 총합
		double avg = 0;	// 평균
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		double n[] = new double[a];		// 입력받은 점수
		for (int i = 0; i < a; i++) {
			n[i] = sc.nextInt();
			if(n[i]> max) {	// 최대값 설정
				max =n[i];
			}
		}
		// 합계구하기
		for (int i = 0; i < a; i++) {
			sum += (n[i] / max) * 100;
		}

		avg = sum / a;

		System.out.println(avg);
	}

}