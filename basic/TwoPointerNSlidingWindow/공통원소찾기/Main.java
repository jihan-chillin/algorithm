package TwoPointerNSlidingWindow.공통원소찾기;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public ArrayList<Integer> solution(int aNum, int bNum, int[] aArr, int[] bArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        // 두 배열 모두 오름 차순 sorting
        Arrays.sort(aArr);
        Arrays.sort(bArr);

        while(p1<aNum && p2<bNum){
            if(aArr[p1] < bArr[p2]) p1 ++;
            else if(aArr[p1] > bArr[p2]) p2 ++;
            else if(aArr[p1] == bArr[p2]) {
                answer.add(aArr[p1++]);
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int aNum = sc.nextInt();
        int[] aArr = new int[aNum];
        for(int i=0; i<aNum; i++){
            aArr[i] = sc.nextInt();
        }

        int bNum = sc.nextInt();
        int[] bArr = new int[bNum];
        for(int i=0; i<bNum; i++){
            bArr[i] = sc.nextInt();
        }

        for(int x : M.solution(aNum, bNum, aArr, bArr)){
            System.out.print(x + " ");
        }
    }
}