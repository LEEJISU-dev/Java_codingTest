import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0; 		// 입력된 벌집의 주소
		int cnt = 0; 	// 벌집까지의 거리
		int tmp = 1;	// 거리가 같은 주소
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		while(true) {
			if(tmp >= a) {
				if(a==1) {
					System.out.println(a);
					break;
				}
				System.out.println(cnt);
				break;
			}
			tmp = tmp + 6 * cnt;
			cnt++;
		}

	}

}
