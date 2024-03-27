import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("This is Guess the Number Game Three Ways! (Java Edition)");
        new NumberGuesser();

        System.out.println("There's also a string reverser because my lecturer asked that too :)");
        System.out.println("Please enter the string you would like to reverse: ");
        String input = new Scanner(System.in).nextLine();
        String reversed = ReverseString.createReverse(input);
        System.out.println(input + " --> " + reversed);
    }
}