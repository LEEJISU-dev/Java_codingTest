import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = 0; // 입력받은 사람의 수

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int arr[][] = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt(); // 몸무게
			arr[i][1] = sc.nextInt(); // 키
		}
		for (int i = 0; i < n; i++) {
			int rank = 1;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				// i번째 사람과 j번째 사람을 비교하여 i가 j보다 덩치가 작을경우 rank값을 1 증가시킨다
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			System.out.print(rank + " ");
		}

	}

}
