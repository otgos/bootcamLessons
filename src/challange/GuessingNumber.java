package challange;

import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        int hiddenNum = (int)(Math.random()*10);
        System.out.println("Hidden number: "+hiddenNum);
        System.out.println("Please guess an integer between 0 and 9. You have "+count+" attempts left.");
        while(count>0){
            int guessNum = scanner.nextInt();
            if(hiddenNum<guessNum){
                count--;
                System.out.println("Incorrect. Please try lesser number...You have "+count+" attempts left.");
            }else if(hiddenNum>guessNum){
                count--;
                System.out.println("Incorrect. Please try larger number...You have "+count+" attempts left.");
            }else{
                System.out.println("Bingo!!! You guessed correct number...");
            }
            if(count==0){
                System.out.println("Unfortunately you lost the game..");
            }
        }

    }
}
