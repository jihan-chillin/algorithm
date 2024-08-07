package Array.격자판최대합;
import java.util.Scanner;

class Main{
    public int solution(int num, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;

        // 행, 열
        for(int i=0;i<num;i++){
            sum1 = sum2 = 0;
            for(int j=0;j<num;j++){
                sum1+= arr[i][j];
                sum2+= arr[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;

        // 대각선
        for(int i=0; i<num; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][num - i -1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(M.solution(num,arr));
    }
}