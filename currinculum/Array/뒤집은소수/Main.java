package Array.뒤집은소수;
import java.util.Scanner;

class Main{
    public int solution(int[] arr){
        int sum = 0, count = 0;
        for(int x : arr){
            if(x == 1) count ++;
            else count = 0;

            sum += count;
        }

        return sum;
    }

    public static void main(String[] args) {
       Main M = new Main();
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int[] arr = new int[num];

       for(int i=0; i < num; i++){
           arr[i] = sc.nextInt();
       }

       System.out.print(M.solution(arr));
    }
}
