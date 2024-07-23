package String.특정문자뒤집기;
import java.util.Scanner;

class Main{
    public String solution(String str){
        String answer = "";

        for(int i=0;i<str.length() ;i++){
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(M.solution(str));
    }
}