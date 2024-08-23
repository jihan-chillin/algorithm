package TwoPointerNSlidingWindow.최대길이연속부분수열;
import java.util.Scanner;

class Main{
    public int solution(int n, int k, int[] arr) {
        int answer = 0, count = 0, lt =0;

        for(int rt = 0; rt < n; rt++){
            if(arr[rt] == 0) count++;
            while(count > k){
                if(arr[lt] ==0) count--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.print(M.solution(n, k, arr));
    }
}