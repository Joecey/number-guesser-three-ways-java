package ie.atu.sw;

public class ReverseString {
    private ReverseString(){}

    public static String createReverse(String input){
        StringBuilder output = new StringBuilder();
        for (int i = (input.length() - 1); i >= 0; i--){
            output.append(input.charAt(i));
        }
        return output.toString();
    }
}
