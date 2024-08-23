package String.문자거리;
import java.util.Scanner;

class Main{
    public int[] solution(String str, char target){
        int P = 1000;
        int[] answer = new int[str.length()];

        // 오른쪽으로 떨어진 거리 계산
        for(int i =0; i < str.length(); i ++){
            if(str.charAt(i) == target) {
                P = 0;
                answer[i] = P;
            }
            else{
                P ++;
                answer[i] = P;
            }
        }

        // 왼쪽으로 떨어진 거리 계산 + 더 작은 숫자 해당 index에 할당
        P = 1000; // 다시 초기화 시켜주고 시작해야함.
        for(int j = str.length() -1; j >= 0 ; j--){
            if(str.charAt(j) == target) P = 0;
            else{
                P ++;
                answer[j] = Math.min(answer[j], P);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int ch : M.solution(str, c)){
            System.out.print(ch + " ");
        }
    }
}