import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str = ""; // 입력받은 문자열

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 67) {
				sum += 3;
			} else if ((int) str.charAt(i) >= 68 && (int) str.charAt(i) <= 70) {
				sum += 4;
			} else if ((int) str.charAt(i) >= 71 && (int) str.charAt(i) <= 73) {
				sum += 5;
			} else if ((int) str.charAt(i) >= 74 && (int) str.charAt(i) <= 76) {
				sum += 6;
			} else if ((int) str.charAt(i) >= 77 && (int) str.charAt(i) <= 79) {
				sum += 7;
			} else if ((int) str.charAt(i) >= 80 && (int) str.charAt(i) <= 83) {
				sum += 8;
			} else if ((int) str.charAt(i) >= 84 && (int) str.charAt(i) <= 86) {
				sum += 9;
			} else if ((int) str.charAt(i) >= 85 && (int) str.charAt(i) <= 90) {
				sum += 10;
			}
		}
		System.out.println(sum);
	}

}
