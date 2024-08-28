package StackNQueue.교육과정설계;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main{

    public String solution(String str1, String str2) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : str1.toCharArray()) Q.offer(x);
        for(char st : str2.toCharArray()){
            if(Q.contains(st)) {
                if(st != Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";
        return  answer;
    }

    public static void main(String[] args) throws IOException {
        Main M = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        StringBuilder sb = new StringBuilder();
        sb.append(M.solution(str1, str2));

        System.out.println(sb.toString());
    }
}