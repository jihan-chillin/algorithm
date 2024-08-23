package Array.임시반장정하기;
import java.util.Scanner;

class Main{

    public int solution(int num, int[][] arr){
        int answer = 0, max = Integer.MIN_VALUE;

        for(int i=1; i<=num ; i++){
            int count = 0;

            for(int j=1; j<=num ; j++){
                for(int k =1; k <=5; k ++){
                    if(arr[i][k] == arr[j][k] && i != j){
                        count++;
                        break;
                    }
                }
            }

            if(max < count) {
                answer = i;
                max = count;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num+1][6];
        for(int i=1; i<=num; i++){
            for(int j=1; j<=5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(M.solution(num, arr));
    }
}
