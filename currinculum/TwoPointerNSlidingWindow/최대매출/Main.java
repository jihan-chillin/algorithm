package TwoPointerNSlidingWindow.최대매출;
import java.util.Scanner;

class  Main{
    public int solution(int n, int k, int[] arr) {

        // sliding window값 초기화
        int answer = 0, sum  = 0;
        for(int i = 0; i<k ; i++) {
            sum += arr[i];
        }

        answer = sum;

        // 하나씩 밀어서 최대값 갱신
        for(int i = k; i<n; i++){
            sum += arr[i] - arr[i-k];
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(M.solution(n, k, arr));
    }
}