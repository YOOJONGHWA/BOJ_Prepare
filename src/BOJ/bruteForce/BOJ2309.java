package BOJ.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2309 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i] = Integer.parseInt(st.nextToken());
            for (int j = 0; j < arr.length-2; j++) {                        // 7
                for (int k = j+1; j < arr.length-3; k++) {                  // 6
                    for(int m = k+1; k < arr.length-4; m++) {               // 5
                        for (int l = m + 1; l < arr.length -5; l++) {       // 4
                            for (int n = l + 1; n < arr.length-6; n++) {    // 3
                                for (int o = n + 1; o < arr.length-7; o++) {    // 2
                                    for (int p = o + 1; p < arr.length; p++) {    // 2
                                        int sum = arr[j] + arr[k] + arr[m] + arr[l] +
                                                  arr[n] + arr[o] + arr[p];
                                        if (sum == 100){
                                            System.out.println(arr[j] + " "+ arr[k] +" "+ arr[m] +" "+ arr[l] +
                                                    " "+arr[n] +" "+ arr[o] +" "+ arr[p]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
