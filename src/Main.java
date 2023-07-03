import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int dieOff = rnd.nextInt(6);
        int die = rnd.nextInt(6) + 1;
        boolean done = false;
        boolean secondDone = false;
        String playAgain;
        String playTrash;
        boolean playDone = false;
        boolean trashDone = false;
       do {
           do {
               int die1 = rnd.nextInt(6) + 1;
               int die2 = rnd.nextInt(6) + 1;
               int crapsRoll = die1 + die2;
               if (crapsRoll == 2) {
                   System.out.println("You got a 2, you crapped out.");
                   done = true;
               }
               else if (crapsRoll == 3) {
                   System.out.println("You got a 3, you crapped out.");
                   done = true;
               }
               else if (crapsRoll == 12) {
                   System.out.println("You got a 12, you crapped out.");
                   done = true;
               }
               else if (crapsRoll == 7) {
                   System.out.println("You got a 7, you won.");
                   done = true;
               }
               else if (crapsRoll == 11) {
                   System.out.println("You got a 11, you won.");
                   done = true;
               }
               else {
                   System.out.println("You got a " + crapsRoll + ". Please roll again.");
                   do {
                       secondDone = false;
                       int die3 = rnd.nextInt(6) + 1;
                       int die4 = rnd.nextInt(6) + 1;
                       int crapsRoll2 = die3 + die4;
                       if (crapsRoll2 == 7) {
                           System.out.println("You got a 7, you lose");
                           done = true;
                           secondDone = true;
                       } else if (crapsRoll2 == crapsRoll) {
                           System.out.println("You got a " + crapsRoll2 + ", you win.");
                           done = true;
                           secondDone = true;
                       } else {
                           System.out.println("You got a " + crapsRoll2 + ". Please roll again.");
                       }
                   }
                   while (!secondDone);
               }
           }
           while (!done);
           do {
               playDone = false;
               trashDone = false;
               System.out.print("Would you like to try again (Y,N): ");
               if (in.hasNext("N")) {
                   playAgain = in.next();
                   playDone = true;
                   trashDone = true;
                   in.nextLine();
               }
               else if (in.hasNext("n")) {
                   playAgain = in.next();
                   playDone = true;
                   trashDone = true;
                   in.nextLine();
               }
               else if (in.hasNext("Y")) {
                   playAgain = in.next();
                   trashDone = true;
                   in.nextLine();
               }
               else if (in.hasNext("y")) {
                   playAgain = in.next();
                   trashDone = true;
                   in.nextLine();
               }
               else {
                   playTrash = in.next();
                   System.out.println("Must enter a valid answer: " + playTrash + "\n");
               }
           }
           while (!trashDone);
       }
       while (!playDone);
        System.out.println("Thank you for playing.");
    }
}