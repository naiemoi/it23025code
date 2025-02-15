public class CharacterChecker {
    public static void main(String[] args) {
        char[] characters = {'A', ' ', '5', 'z', '\n', '9', 'G', '\t'};
        checkCharacters(characters);
    }

    // Function to check and classify characters
    public static void checkCharacters(char[] arr) {
        for (char c : arr) {
            if (Character.isLetter(c)) {
                System.out.println("'" + c + "' is a Letter.");
            } else if (Character.isWhitespace(c)) {
                System.out.println("'" + c + "' is a Whitespace character.");
            } else if (Character.isDigit(c)) {
                System.out.println("'" + c + "' is a Digit.");
            } else {
                System.out.println("'" + c + "' is a Special character.");
            }
        }
    }
}
