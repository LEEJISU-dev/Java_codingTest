import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0; // 입력받을 수의 개수
		StringBuilder sb = new StringBuilder();
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());	// 정렬할 수
		}
		
		// 정렬 메소드(시간 복잡도 : O(n) ~ O(nlogn) )
		// Timesort : 합병정렬 / 반복합병 및 삽입정렬의 최선의 경우를 합한 알고리즘
		Collections.sort(list);
		
		for(int result : list) {
			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}

}
