package Array.멘토링;
import java.util.Scanner;

class Main{
    public int solution(int[][] arr, int n, int m){
        int answer = 0;

        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=n;j++){
                int count = 0;
                for(int k = 0; k < m; k++){ // 시험횟수

                    int pi = 0, pj = 0;

                    for(int s = 0; s <n; s++) { // 학생수
                        if( arr[k][s] == i ) pi = s;
                        if( arr[k][s] == j ) pj = s;
                    }
                    if(pi < pj) count ++;
                }
                if(count == m) answer ++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
       System.out.println(M.solution(arr, n, m));
    }
}
