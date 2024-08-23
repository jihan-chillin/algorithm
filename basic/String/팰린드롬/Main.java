package String.팰린드롬;
import java.util.Scanner;

class Main{
    public String solution(String str){
        String answer = "NO";

        // 대소문자 구분 X && 알파벳 아닌 것들 제거
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(M.solution(str));
    }
}