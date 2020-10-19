import java.util.Scanner;

public class Main {
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		int n = 0; // 원판의 개수

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sb.append((int)(Math.pow(2, n)-1)).append('\n');
		
		Hanoi(n,1,2,3);
		System.out.println(sb);
		
	}
	public static void Hanoi(int n, int start, int mid, int to) {
		// 이동할 원반의 수가 1개일 경우
		if(n==1) {
			sb.append(start+" "+to+"\n");
			return;
		}
		// 1. n-1개를 A에서 B로 이동
		Hanoi(n-1, start, to, mid);
		// 2. 1개를 A에서 C로 이동
		sb.append(start+ " "+to+"\n");
		// 3. n-1개를 B에서 C로 이동
		Hanoi(n-1, mid, start, to);
	}
}
