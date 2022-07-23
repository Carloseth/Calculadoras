import java.util.Locale;
import java.util.Scanner;

public class Calculadora_Program {
    public static void main(String[] args) throws Exception 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;
        String mostrarResultado;
        System.out.println("Olá, insira o seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Muito bem, agora insira sua altura, em metros: ");
        altura = sc.nextDouble();
        imc = calcularIMC(peso,altura);
        mostrarResultado = resultadoIMC(imc);
        System.out.printf("Seu resultado é: %s", mostrarResultado);
        sc.close();
    }
        static double calcularIMC(double peso, double altura) 
        {
            return peso/(altura*altura);
        }

        static String resultadoIMC(double imc)
        {
            String result;
          if (imc <= 19)
             result = "Abaixo do Peso";
          else
             if (imc <= 25)
                result = "Peso ideal";
             else
                if (imc <= 30)
                   result = "Acima do Peso";
                else
                   if (imc <= 35)
                      result = "Obesidade Leve";
                   else
                      result = "Obesidade"; 
          
          return result;
        
    }
}
