package StackNQueue.공주구하기;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{

    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();

        for(int i = 1 ; i <= n ; i++){
            Q.offer(i);
        }

        while(!Q.isEmpty()){
            for(int i =1; i<k; i++) Q.offer(Q.poll());
            Q.poll();
            if(Q.size() == 1) answer = Q.peek();
        }

        return  answer;
    }

    public static void main(String[] args) throws IOException {
        Main M = new Main();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append(M.solution(n, k));

        System.out.println(sb.toString());

    }
}