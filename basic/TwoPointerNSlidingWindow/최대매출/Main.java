package TwoPointerNSlidingWindow.최대매출;
import java.util.Scanner;

class  Main{
    public int solution(int n, int m, int[] arr) {
        int answer = 0, lt = 0, sum = 0;

        for (int rt =0 ; rt <n; rt ++){
            sum+=arr[rt];
            if(sum == m) answer++;
            while(sum >= m){
                sum -= arr[lt++];
                if(sum==m) answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(M.solution(n, m, arr));
    }
}