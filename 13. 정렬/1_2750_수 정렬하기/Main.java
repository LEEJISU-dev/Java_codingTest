import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0; // 입력받을 수의 개수

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();	// 정렬할 수
		}
		//선택정렬 (시간복잡도 : O(n2) )
		/* for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}*/
		
		// 정렬 메소드(시간 복잡도 : 평균 O(nlogn))
		Arrays.sort(arr);	
		
		for(int result : arr) {
			System.out.println(result);
		}
	}

}
