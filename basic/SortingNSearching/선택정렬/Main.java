package SortingNSearching.선택정렬;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class  Main{
    public int[] solution(int n, int[] arr) {

        for(int i =0; i < n -1  ; i++){
            int idx = i;
            for(int j = i+1; j < n ; j++){
                if(arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) throws IOException {
        Main M = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int x : M.solution(n, arr)) {
            sb.append(x).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}