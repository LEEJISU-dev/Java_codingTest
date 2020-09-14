import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s;
		char alpa[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int a[] = new int[26];
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		for (int i = 0; i < a.length; i++) {
			a[i] = -1;
		}
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < alpa.length; j++) {
				if (s.charAt(i) == alpa[j]) {
					a[j] = s.indexOf(alpa[j]);
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
	}

}
