import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 수의 범위 (0~10000)
		int[] cnt = new int[10001];
		// 시간초과로 인해 입출력의 성능을 좋은 것을 택해야 함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			// 해당 인덱스의 값을 1 증가
			cnt[Integer.parseInt(br.readLine())]++;
		}

		br.close();

		StringBuilder sb = new StringBuilder();
		
		// 0은 입력범위에서 없으므로 1부터 시작
		for (int i = 1; i < 10001; i++) {
			// i 값이 개수가 0이 될 때까지 출력(빈도수)
			while (cnt[i] > 0) {
				sb.append(i).append('\n');
				cnt[i]--;
			}
		}
		System.out.println(sb);
	}

}
