package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class BOJ5597 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> sendPerson = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            int sendValue = Integer.parseInt(br.readLine());
            sendPerson.add(sendValue);
        }
        ArrayList<Integer> totalPerson = new ArrayList<>();
        for (int i = 1; i < 31; i++) {
            totalPerson.add(i);
        }
        ArrayList<Integer>missingPerson = new ArrayList<>(totalPerson);
        missingPerson.removeAll(sendPerson);
        Collections.sort(missingPerson);
        System.out.println(missingPerson.get(0) + "\n" + missingPerson.get(1));


    }

}
