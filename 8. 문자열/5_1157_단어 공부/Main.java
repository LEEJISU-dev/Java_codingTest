import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s = ""; // 입력받은 문자열
		int cnt[] = new int[26]; // 반복되는 알파벳수
		int max = 0;	// 몇번 사용되었는지 카운트
		char result = '?';	// 가장 많이 사용한 알파벳
		
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		s = s.toUpperCase();

		for (int i = 0; i < s.length(); i++) {	// 사용된 알파벳 갯수 세기
			cnt[(int)s.charAt(i)-65]++;
			if(max < cnt[s.charAt(i)-65]) {
				max = cnt[s.charAt(i)-65];
				result = s.charAt(i);
			}else if (max == cnt[s.charAt(i)-65]) {
				result ='?';
			}
		}
		System.out.println(result);
	}

}
