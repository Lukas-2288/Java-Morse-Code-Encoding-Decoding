import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, this program allows you to translate text to morse code or translate morse code to text!");
        while (true) {
            System.out.println();
            System.out.println("Please select one of the below options:");
            System.out.println("***Enter 't' for encoding text");
            System.out.println("***Enter 'm' for decoding morse code");
            System.out.println("***Enter 'e' to exit the program");
            String userChoice = input.nextLine();

            if (userChoice.equals("t")) {
                EnglishToMorseCode();
            } else if (userChoice.equals("m")) {
                MorseCodeToEnglish();
            } else if (userChoice.equals("e")) {
                System.exit(0);
            } else {
                System.out.println("***invalid option***");
                System.out.println("Please enter a valid option");
            }

        }
    }

    public static void EnglishToMorseCode() {
        char[] Alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String[] MorseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a phrase: ");
        String userChoice = input.nextLine().toLowerCase();
        System.out.println("Morse Code: ");
        for (int i = 0; i < userChoice.length(); i++) {
            for (int j = 0; j < Alphabet.length; j++) {
                if (userChoice.charAt(i) == Alphabet[j]) {

                    System.out.print(MorseCode[j] + " ");

                }
            }
            if (userChoice.charAt(i) == '\n') {
                System.out.print("  ");
            }

        }
    }

    public static void MorseCodeToEnglish() {
        char[] Alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        //char[] Alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        String[] MorseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Morse code: ");
        String userMorseCode = input.nextLine();
        String[] splitMorseCode = userMorseCode.split(" ");

        System.out.println("Normal Text: ");
        for (int i = 0; i < splitMorseCode.length; i++) {
            for (int j = 0; j < MorseCode.length; j++) {
                if (splitMorseCode[i].equals(MorseCode[j])) {
                    System.out.print(Alphabet[j]);
                }
            }
            //if (splitMorseCode[i].equals("\n")) {
                if (userMorseCode.charAt(i)== ' ') {
                System.out.print(" ");
            }
        }
    }
}
