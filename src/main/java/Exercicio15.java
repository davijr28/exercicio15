import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Exercicio15 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        int idade;
        String nome;
        System.out.println("Digite o seu nome: ");
        nome = leitor.nextLine();
        nome = toUpperCase(nome);
        System.out.println("Digite a sua idade: ");
        idade = leitor.nextInt();

        if (idade > 15 && idade < 25) {
            System.out.println(nome + " ACEITA!");
        } else {
            System.out.println(nome + " NÃO ACEITA!");
        }
    }
}
