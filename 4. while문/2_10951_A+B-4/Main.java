import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		//hasNextInt() 는 다음번에 호출할 nextInt() 가 정상적으로 수행될 수 있으면 true, 그렇지 않으면 false 를 반환
		while (sc.hasNextInt()) {	// End of File 판단
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(a + b);

		}

	}

}