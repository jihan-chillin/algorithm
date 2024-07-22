package String.대소문자변환;
import java.util.Scanner;

class Main{
    public String solution(String str) {
        String answer = "";

        // 1. Character클래스로 해결 <- 난 이게 좋음
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
        }

        // 2. 아스키문자로 처리
        for(char c : str.toCharArray()){
            if(c >= 97 && c <= 122) answer += (char)(c-32);
            else answer += (char)(c+32);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}