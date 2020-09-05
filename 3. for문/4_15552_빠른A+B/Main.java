import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine().trim());	// n을 입력받음

		for (int i = 0; i < n; i++) {
			String text = br.readLine();	// 입력받은 A B
			String[] word = text.split(" ");	// 공백 제거후 저장
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			bw.write((a+b) + "\n");	// 출력
			
		}
		bw.flush();
	}

}