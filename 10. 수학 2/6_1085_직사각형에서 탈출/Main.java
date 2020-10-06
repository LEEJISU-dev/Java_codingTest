import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 0; // 자연수 x(지금 있는 위치)
		int y = 0; // 자연수 y(지금 있는 위치)
		int w = 0; // 자연수 w(직사각형의 꼭지점)
		int h = 0; // 자연수 h(직사각형의 꼭지점)
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		
		System.out.println(Math.min(Math.min(w-x, x), Math.min(h-y, y)));
		
	}

}
