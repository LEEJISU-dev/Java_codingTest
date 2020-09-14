import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s = ""; // 입력받은 문자열
		String str = ""; 
		int count = 0; 	// 단어수 카운트
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			String b = String.valueOf(s.charAt(i));	// 문자로 하나씩 저장
			if (b.equals(" ")) {
				str = "";
			} else {
				if (str.length() == 0) {
					count++;
				}
				str = b;
			}

		}

		System.out.println(count);
	}

}
