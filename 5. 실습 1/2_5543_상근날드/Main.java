import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int tmp = 0;
		int tmp2 = 0;
		int set = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			n = sc.nextInt();
			if (i == 0) {
				tmp = n;
			}
			if (n < tmp) {
				tmp = n;
			}
		}
		for (int i = 0; i < 2; i++) {
			n = sc.nextInt();
			if (i == 0) {
				tmp2 = n;
			}
			if (n < tmp2) {
				tmp2 = n;
			}
		}
		set = (tmp + tmp2) - 50;
		System.out.println(set);

	}

}