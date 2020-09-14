import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n; // 입력받은 단어의 개수
		String str; // 입력받은 단어

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int cnt = n; // 그룹단어 체크
		for (int i = 0; i < n; i++) {
			str = sc.next();
			int[] alpa = new int[26]; // 중복 체크
			char tmp = ' ';
			for (int j = 0; j < str.length(); j++) {
				alpa[(int) str.charAt(j) - 97]++;
				
				// 현재단어와 전단어가 같지 않을 경우 && 중복이 1이상일 경우
				if (tmp != str.charAt(j) && (alpa[(int) str.charAt(j) - 97] > 1)) {
					cnt--; // 그룹단어가 아님
					break;

				}
				tmp = str.charAt(j);
			}
		}

		System.out.println(cnt);
	}

}
