
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n; // 입력되는 단어의 수
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		String arr[] = new String[n];
		sc.nextLine();	// 개행 버림
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 단어길이가 같을 경우
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
					// 그 외의 경우
				} else {
					return o1.length() - o2.length();
				}
			}
		});

		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append('\n');
		for(int i=1;i<n;i++) {
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append('\n');
			}
		}
		System.out.println(sb);

	}

}
