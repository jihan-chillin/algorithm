package String.문장속단어;
import java.util.Scanner;

class Main{
    public String solution(String str){

        String answer = "";
        int stringLength = Integer.MIN_VALUE, pos; // int stringLength = 0;

        // 1. 단어 배열을 생성해서 요소 별 길이로 처리하는 방법 <- 난 이게 더 좋음.
        // 문자열을 공백기준으로 분할해서 단어 배열
//        String[] words = str.split(" ");
//
//        for(String word : words){
//            if(word.length() > stringLength){
//                stringLength = word.length();
//                answer = word;
//            }
//        }

        // 2. indexOf 함수 사용해서 처리하는 방법
        while((pos = str.indexOf(" "))!=-1){ // 띄어쓰기를 발견못하면 -1
            String tmp = str.substring(0, pos); // 0부터 pos 전까지
            int len = tmp.length();
            if(len > stringLength){
                stringLength = len;
                answer = tmp;
            }

            // 띄어쓰기 뒤에 문자로 갱신
            str = str.substring(pos + 1);
        }

        // 마지막 단어에 대한 처리
        if(str.length() > stringLength) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }
}