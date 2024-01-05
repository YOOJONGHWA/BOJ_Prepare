package BOJ.oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ10871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bw.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bw.readLine()," ");
		for(int i = 1; i <= N; i++) {
			int A = Integer.parseInt(st.nextToken());
			System.out.println(i + " : " + A);
			if(A < X) {
				sb.append(A).append("\n");
			}
		}
		System.out.println();
		System.out.println(sb);

	}

}
