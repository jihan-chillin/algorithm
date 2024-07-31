package String.문자열압축;
import java.util.Scanner;

class Main{
    public String solution(int letterCnt, String str){
        String answer = "";

        for(int i=0; i < letterCnt; i++){
            String tmp = str.substring(0,7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String str = sc.next();
        System.out.println(M.solution(cnt, str));
    }
}