import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String calpa[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };	// 크로아티아 알파벳
		String str;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		str = sc.nextLine().trim();

		for (int i = 0; i < calpa.length; i++) {
			str = str.replaceAll(calpa[i], "*");	// 크로아티아 알파벳을 "*"로 치환
		}
		System.out.println(str.length());
	}

}
