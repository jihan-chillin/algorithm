package String.중복문자제거;
import java.util.Scanner;

class Main{
    public String solution(String str){
        String answer;
        char[] chars = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while(lt < rt){
            if(!Character.isAlphabetic(chars[lt])) lt ++;
            else if(!Character.isAlphabetic(chars[rt])) rt --;
            else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt ++;
                rt --;
            }
        }

        answer = String.valueOf(chars);
        return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(M.solution(str));
    }
}