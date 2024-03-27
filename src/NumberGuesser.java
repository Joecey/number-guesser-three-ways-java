import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuesser {
    private final static int MAX_GUESSES = 12;
    private int targetNumber;
    private final Scanner userInput;
    private int guess;// final as we are setting one instance of a scanner

    public NumberGuesser(){
        userInput = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n *************************************");
            System.out.println("Choose your version of Number Guesser");
            System.out.println("1) As specified in my lecture notes");
            System.out.println("2) Do-Loop version");
            System.out.println("3) For-loop version");
            System.out.println("4) Recursion Version");
            System.out.println("5) Exit");
            try {
                int choice = userInput.nextInt();
                switch (choice) {
                    case 1 -> startLectureVersion();
                    case 2 -> startDoLoopVersion();
                    case 3 -> startForLoopVersion();
                    case 4 -> startRecursionVersion();
                    case 5 -> {
                        System.out.println("Thanks for playing!");
                        running = false;
                    }
                    default -> System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("There was an issue with input. Please use int value" + e);
                break;
            }
        }

    }
    public void startLectureVersion(){
        System.out.println("Lecture Version");
        targetNumber = (int) Math.floor(Math.random() * 100); // error prone

        int counter = 0;
        while (counter < MAX_GUESSES){
            System.out.println("*** What is your guess (Between 1 and 100)? ***");
            System.out.println((MAX_GUESSES - counter) + " guesses left \n");
            guess = userInput.nextInt();
            if (guess == targetNumber){
                System.out.println("You got the right number! " + guess);
                break;
            } else if (guess > targetNumber) {
                System.out.println("Wrong number (too high), try again");

            }else {
                System.out.println("Wrong number (too low), try again");
            }
            counter++;
        }

        if (guess != targetNumber){
            System.out.println("too bad! The answer was: " + targetNumber);
        }
    }

    public void startDoLoopVersion(){
        System.out.println("Do-Loop Version");
        Random rand = new Random();
        targetNumber = rand.nextInt(1, 101); // better
    }

    public void startForLoopVersion(){
        System.out.println("For-Loop Version");
        ThreadLocalRandom random = ThreadLocalRandom.current();
        targetNumber = random.nextInt(1, 101); // best - more random

    }

    public void startRecursionVersion(){
        System.out.println("Recursion Version");
        ThreadLocalRandom random = ThreadLocalRandom.current();
        targetNumber = random.nextInt(1, 101); // best - more random
    }
}
