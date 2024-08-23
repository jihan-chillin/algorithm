package String.단어뒤집기;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public ArrayList<String> solution(int num, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        // 1. StringBuilder.reverse() 메소드 사용
//        for(String word: str){
//            String tmp = new StringBuilder(word).reverse().toString();
//            answer.add(tmp);
//        }

        // 2. 양쪽 극단에 있는 애들끼리 바꾸는 방법 <- 얘가 맘에든다.
        for (String s : str){
            char[] c = s.toCharArray();
            int lt = 0, rt = s.length()-1;

            while(lt < rt){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt ++;
                rt --;
            }

            String tmp = String.valueOf((c));
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String[] str = new String[num];
        for(int i = 0; i < num; i++){
            str[i] = sc.next();
        }

        for(String word : M.solution(num, str)){
            System.out.println(word);
        }
    }
}