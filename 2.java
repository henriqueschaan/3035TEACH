import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma string:");
        String str = sc.nextLine();
        System.out.println("A string ao contrário é: " + getReverseString(str));
    }

    public static String getReverseString(String str){
        String nstr = "";        
        char ch;
        for (int i=0; i<str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
            }
        return nstr;
    }

}