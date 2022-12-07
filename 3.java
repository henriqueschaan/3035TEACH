import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma string:");
        String str = sc.nextLine();
        System.out.println("As vogais são: " + getVowels(str));
    }

    public static String getVowels(String str){
        String onlyVowels = "";

        char[] letters = str.toCharArray();
        for (char letter : letters) {
            if (letter == 'a' || letter == 'A' ||
            letter == 'e' || letter == 'E' ||
            letter == 'i' || letter == 'I' ||
            letter == 'o' || letter == 'O' ||
            letter == 'u' || letter == 'u') {
                onlyVowels += letter;
            }
        }
        return onlyVowels;
    }

}