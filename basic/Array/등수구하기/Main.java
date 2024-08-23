package Array.등수구하기;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public ArrayList<Integer> solution(int num, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i =0 ; i<num ; i++){
            int grade = 1;
            for(int j=0 ; j <num; j ++){
                if(arr[i] < arr[j]) grade ++;
            }
            answer.add(grade) ;
        }

        return answer;
    }

    public static void main(String[] args) {
       Main M = new Main();
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int[] arr = new int[num];

       for(int i=0; i < num; i++){
           arr[i] = sc.nextInt();
       }

       for(int x : M.solution(num, arr)){
           System.out.print(x + " ");
       }
    }
}
