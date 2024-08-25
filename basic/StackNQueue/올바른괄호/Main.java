package StackNQueue.올바른괄호;
import java.util.Scanner;
import java.util.Stack;

class Main{

    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                else stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(M.solution(str));
    }
}