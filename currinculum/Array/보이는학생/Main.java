package Array.보이는학생;
import java.util.Scanner;

class Main{
    public int solution(int[] arr, int num){
        int answer = 1, max = arr[0];
        for(int i=1; i < num; i++){
            if(arr[i] > max){
                answer++;
                max= arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
       Main M = new Main();
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int[] arr = new int[num];

       for(int i =0; i < num; i++){
           arr[i] = sc.nextInt();
       }

       System.out.println(M.solution(arr, num));
    }
}
