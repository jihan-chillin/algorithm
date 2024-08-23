package String.암호;
import java.util.Scanner;

class Main{
    public int solution(String str){
        // 1. 아스키 넘버로 이용하기 <- 이게 더 좋음
        int answer = 0;
        for(char c : str.toCharArray()){
            if(c >= 48 && c <= 57) answer = answer * 10 + (c-48);
        }
        return answer;

        // 2. 메소드를 이용하는 방법
        // String answer = "";
        // for(char c : str.toCharArray()){
        //     if(Character.isDigit(c)) answer += c;
        // }

        // return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(M.solution(str));
    }
}