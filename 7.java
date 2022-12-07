import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira um número.");
        double num = sc.nextDouble();
        
        double cinco = 0.05 * num;
        System.out.printf("\n5%% do número inserido é %.1f.",cinco);
        
        double cinquenta = 0.5 * num;
        System.out.printf("\n50%% do número inserido é %.2f.",cinquenta);
        
        double centoecinquenta = 1.5 * num;
        System.out.printf("\n150%% do número inserido é %.3f.",centoecinquenta);        
    }

}