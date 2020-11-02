import java.util.Scanner;

public class Main {
	public static boolean[][] arr;
	public static int min = 64;

	public static void main(String[] args) {
		int n = 0; // 입력받은 수
		int m = 0; // 입력받은 수2
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		// m * n 배열
		arr = new boolean[n][m];
		
		/* Scanner의 경우 공백자로 구분하다가 개행으로 입력되면 
		 * 스트링에 개행이 남아있어 의도와 달리 첫번째 String 입력은 개행에 저장된다.
		 * 그렇기 때문에 nextLine()을 통해
		 * 문자열 입력 전의 int와 String입력 사이의 개행을 없애주도록 한다.
		 */
		
		sc.nextLine();
		
		// m * n 배열 입력
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine().trim();

			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true; // W일 경우 true
				} else {
					arr[i][j] = false; // B일 경우 false
				}
			}
		}

		int n_row = n - 7;
		int m_col = m - 7;

		for (int i = 0; i < n_row; i++) {
			for (int j = 0; j < m_col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);

	}

	public static void find(int x, int y) {
		int end_x = x+8;
		int end_y = y+8;
		int cnt =0;
		
		boolean TF = arr[x][y];	// 첫 번째 칸의 색
		
		for(int i=x;i<end_x;i++) {
			for(int j=y;j<end_y;j++) {
				if(arr[i][j] != TF) {
					cnt++;
				}
				/* 다음 칸은 색이 바뀌므로 
				 * true라면 false, false라면 true로 값을 변경*/
				TF = (!TF);
			}
			TF = !TF;
		}
		/* 첫 번째 칸을 기준으로 할 때의 색칠 할 개수(cnt)와 
		 * 첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의 색칠 할 개수(64-cnt) 중 
		 * 최솟값을 cnt에 저장
		 */
		cnt = Math.min(cnt, 64-cnt);
		
		/*
		 * 이전까지의 경우 중 최솟값보다 현재 cnt값이 더 작을 경우 최솟값을 갱신 
		 */
		min = Math.min(min, cnt);
	}
}
