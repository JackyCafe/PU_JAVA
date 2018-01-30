package java1;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        int ans = (int) (Math.random()*100)+1;
        //System.out.println(ans);
        int guess = 0 , min = 0, max = 100;
        Scanner sc = new Scanner(System.in);
        do{
            if (guess < ans ) {
                min = guess;
                System.out.println("請輸入" + min + "~" + max + " 中任１值");
            }
            else {
                max = guess;
                System.out.println("請輸入" + min  + "~" + max + " 中任１值");

            }
            guess = sc.nextInt();



        }while(ans != guess);
        System.out.println("You Win");

    }
}
