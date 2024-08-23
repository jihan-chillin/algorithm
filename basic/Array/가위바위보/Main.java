package Array.가위바위보;
import java.util.Scanner;

class Main{
    public String solution(int num, int A, int B){
        String answer = "";

        if(A==B) answer = "D";
        else{
            if(A == 1) answer = B == 2 ? "B" : "A";
            else if(A == 2) answer = B == 3 ? "B" : "A";
            else answer = B == 1 ? "B" : "A";
        }

        return answer;
    }

    public static void main(String[] args) {
       Main M = new Main();
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int[] Aarr = new int[num];
       int[] Barr = new int[num];

       for(int i=0; i<num; i++){
           Aarr[i] = sc.nextInt();
       }
       for(int i=0; i<num; i++){
        Barr[i] = sc.nextInt();
       }

       for(int i=0; i < num; i++){
            System.out.println(M.solution(num, Aarr[i], Barr[i]));
       }
    }
}
