public class Main {

	public static void main(String[] args) {
		boolean[] chk = new boolean[10001];
		int n = 0;
		for (int i = 1; i <= 10000; i++) {
			n = d(i);

			// 10000이 넘는 수는 필요 없음
			if (n < 10001) {
				chk[n] = true;
			}
		}
		for (int i = 1; i < chk.length; i++) {
			if (!chk[i]) {
				System.out.println(i);
			}
		}

	}

	public static int d(int i) {
		int tmp = i;

		while (i > 0) {
			tmp += i % 10;
			i /= 10;
		}
		return tmp;
	}

}
