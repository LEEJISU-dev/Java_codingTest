import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String calpa[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String str;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		str = sc.nextLine().trim();

		for (int i = 0; i < calpa.length; i++) {
			str = str.replaceAll(calpa[i], "*");
		}
		System.out.println(str.length());
	}

}
