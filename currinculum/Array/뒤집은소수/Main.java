package Array.뒤집은소수;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public boolean isPrime(int num){
        if(num ==1) return false;
        for(int i=2; i<num; i++){
            if(num%i ==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int num, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i =0; i< num ; i++){
            int result = 0;
            int temp = arr[i];
            while (temp > 0){
                int t = temp % 10;
                result = result * 10 + t;
                temp = temp / 10;
            }

            if(isPrime(result)) answer.add(result);
        }

        return answer;
    }

    public static void main(String[] args) {
       Main M = new Main();
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int[] arr = new int[num];

       for(int i=0; i < num; i++){
           arr[i] = sc.nextInt();
       }

       for(int x : M.solution(num, arr)){
           System.out.print(x + " ");
       }
    }
}
