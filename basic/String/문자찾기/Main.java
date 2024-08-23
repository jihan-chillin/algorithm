package String.문자찾기;
import java.util.Scanner;

class Main{
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()){
            if(x == t){
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char t = sc.next().charAt(0);
        System.out.println(T.solution(str, t));
    }
}