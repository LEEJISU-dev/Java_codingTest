import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double r = 0; // 입력받은 원의 반지름
		
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		
		// 유클리드 원의 넓이 = 𝜋𝑟² 
		System.out.println(r*r*Math.PI);	
		// 택시기하학 원의 넓이 = 2𝑟² 
		System.out.println(2*r*r); 			
		
	}

}
