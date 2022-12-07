import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números.");
        double um = sc.nextDouble();
        double dois = sc.nextDouble();
        double res;
        
        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");
        int opcao = sc.nextInt();
        
        switch (opcao) {
            case 1 -> {
                res = um + dois;
                System.out.println("A soma dos números é " + res);
            }
            case 2 -> {
                res = um - dois;
                System.out.println("A subtração dos números é " + res);
            }
            case 3 -> {
                res = um * dois;
                System.out.println("A multiplicação entre os números é " + res);
            }
            case 4 -> {
                res = um / dois;
                System.out.println("A divisão dos números é " + res);
            }
            default -> System.out.println("Opção inválida.");
        }
        
    }

}