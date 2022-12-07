import java.util.Scanner;



public class Programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira três números.");
        double nUm = sc.nextDouble();
        double nDois = sc.nextDouble();
        double nTres = sc.nextDouble();
        
        double soma = nUm + nDois + nTres;
        System.out.printf("\nA soma dos números inseridos é %.2f.",soma);
        
        double media = (nUm + nDois + nTres) / 3 ;
        System.out.printf("\nA média dos números inseridos é %.2f.",media);
    }

}