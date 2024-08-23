package Array.큰수출력하기;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public ArrayList<Integer> solution(int num, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<num; i++){
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : M.solution(num, arr)){
            System.out.print(x+" ");
        }
    }
}
