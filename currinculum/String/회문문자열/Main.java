package String.회문문자열;
import java.util.Scanner;

class Main{
    public String solution(String str){
        // 1. string 길이의 홀/짝여부를 이용하는 방법 -> 이게 더 좋다.
        String answer = "YES";

        str = str.toUpperCase();

        int len = str.length();
        for(int i = 0; i < len/2; i++) {
            if(str.charAt(i) !=str.charAt(len-1-i)) return "NO";
        }
        return answer;

        // 2. StringBuilder 이용하는 방법
//        String answer = "NO";
//        String tmp = new StringBuilder(str).reverse().toString();
//        if(str.equalsIgnoreCase(tmp)) return "YES";
//        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(M.solution(str));
    }
}