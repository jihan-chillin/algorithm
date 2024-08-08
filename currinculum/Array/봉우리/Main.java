package Array.봉우리;
import java.util.Scanner;

class Main{
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int num, int[][] arr){
        int answer = 0;

        for(int i =0; i < num; i++){
            for(int j =0; j < num; j++){
                boolean flag = true;

                for(int k=0; k<4; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];

                    if(nx >= 0 && nx < num && ny >= 0 && ny < num && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }

                if(flag) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
       Main M = new Main();
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int[][] arr = new int[num][num];
       for(int i=0; i<num; i++){
           for(int j=0; j<num; j++){
               arr[i][j] = sc.nextInt();
           }
       }
       System.out.println(M.solution(num, arr));
    }
}
