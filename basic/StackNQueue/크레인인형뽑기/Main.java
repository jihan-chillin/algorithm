package StackNQueue.크레인인형뽑기;
import java.util.Scanner;
import java.util.Stack;

class Main{

    public int solution(int n, int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for(int x : moves){
            for(int i = 0; i<n ; i++){
                if(board[i][x-1] == 0) continue;
                else{
                    if(basket.isEmpty() || basket.peek() != board[i][x-1]) {
                        basket.push(board[i][x - 1]);
                    }
                    else {
                        answer +=2;
                        basket.pop();
                    }
                    board[i][x-1] = 0;
                    break;
                }
            }
        }

        return  answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i =0; i<n ; i++){
            for(int j =0; j<n ; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int mn = sc.nextInt();
        int[] moves = new int[mn];
        for(int i =0; i <mn; i++){
            moves[i] = sc.nextInt();
        }

        System.out.print(M.solution(n, board, moves));
    }
}