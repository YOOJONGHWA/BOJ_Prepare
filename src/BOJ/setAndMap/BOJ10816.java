//package BOJ.setAndMap;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class BOJ10816 {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        int[] answer = {1,2,3,4,5};
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0; i < answer.length; i++) {
//            list.add(answer[i]);
//        }
//        list.sort(Collections.reverseOrder());
//
//        String X = "";
////        X.charAt()
//        int xLen = X.length();
//
//        for (int asd : list) {
//            System.out.println();
//        }
//
//        Map<Integer,Integer> map = new <>();
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//        for (int i = 0; i < n; i++) {
//            int card = Integer.parseInt(st.nextToken());
//            int count = 0;
//            map.put(card,count);
//        }
//        ArrayList<Integer> arrayList = new ArrayList<>(map.keySet());
//        for (int asd : arrayList) {
//            System.out.println(asd);
//        }
//
//    }
//
//}
