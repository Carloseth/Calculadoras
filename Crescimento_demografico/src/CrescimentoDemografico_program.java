import java.util.Locale;
import java.util.Scanner;

public class CrescimentoDemografico_program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double populacao, taxa;
        double calc = 0;
        int ano;
        System.out.println("Crescimento demográfico mundial \n");

        System.out.print("Digite a quantidade de pessoas atualmente em bilhões: ");
        populacao = sc.nextDouble();

        System.out.print("Digite a taxa de crescimento anual: ");
        taxa = sc.nextDouble();
        
        System.out.println("Digite o ano atual: ");
        ano = sc.nextInt();

        calc = populacao + (populacao * (taxa/100));
        //Falta corrigir a atualização da população
        System.out.printf("Populacao em %d é: %.2f \n", ano, populacao);
        System.out.printf("Populacao em %d é: %.2f \n", ano + 1, populacao*2);
        sc.close();
    }
}
