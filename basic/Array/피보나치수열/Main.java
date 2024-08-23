package Array.피보나치수열;
import java.util.Scanner;

// 1. 배열 쓰는 방법
class Main{
    public int[] solution(int num){
        int[] answer = new int[num];

        answer[0] = 1;
        answer[1] = 1;

        for(int i=2; i<num; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int x : M.solution(num)){
            System.out.print(x + " ");
        }
    }
}

// 2. 배열 안쓰는 방법
//class Main{
//    public void solution(int num){
//        int a = 1, b = 1, c;
//        System.out.print(a + " " + b + " ");
//        for(int i=2; i<num; i++){
//            c = a+b;
//            System.out.print(c + " ");
//            a = b;
//            b = c;
//        }
//    }
//
//    public static void main(String[] args) {
//        Main M = new Main();
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        M.solution(num);
//    }
//}
