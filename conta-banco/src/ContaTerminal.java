import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println ("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println ("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt(); 
        
      
        System.out.println("Olá " + nome  + " " + sobrenome + ".");
        System.out.println("Obrigado por criar uma conta em nosso banco. "); 
        System.out.println("Sua agência é " + agencia + " conta " + conta + " e seu saldo de 237.48 já está disponível para saque. "); 
        
    }
}

// https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe
