package StackNQueue.쇠막대기;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main{

    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(') stack.push('(');
            else{
                stack.pop();
                // 레이저 지점
                if(str.charAt(i-1) == '(') answer += stack.size();
                // 남은 막대기
                else answer ++;
            }
        }
        return  answer;
    }

    public static void main(String[] args) throws IOException {
        Main M = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        sb.append(M.solution(str));

        System.out.println(sb.toString());
    }
}