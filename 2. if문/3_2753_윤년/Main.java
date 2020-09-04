import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		// 윤년일경우
		if (((a % 4) == 0) && (((a % 100) != 0) || ((a % 400) == 0))) {
			System.out.println("1");
		} else {	// 윤년이 아닐경우
			System.out.println("0");
		}

	}

}