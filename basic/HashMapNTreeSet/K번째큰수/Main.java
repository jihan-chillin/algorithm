package HashMapNTreeSet.K번째큰수;
import java.util.*;

class Main{
    public int solution(int[] arr, int n, int k) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for(int i =0; i<n ; i++){
            for(int j =i+1; j<n ; j++){
                for(int l =j+1; l<n ; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int count = 0;
        for(int x : Tset){
            count ++;
            if(count == k) return x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(M.solution(arr, n, k));
    }
}