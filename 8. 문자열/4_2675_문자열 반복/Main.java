import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n; // 입력받을 문자열수
		int r; // 반복하는 글자수
		String s = "" ; // 입력받은 문자열
		String p = ""; // 출력할 문자열
		char tmp;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			r = sc.nextInt();
			s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				
				for (int k = 0; k < r; k++) {
					p += Character.toString(s.charAt(j));	// 한글자씩 추가
				}
			}
			System.out.println(p);
			p = "";
		}
	}

}
