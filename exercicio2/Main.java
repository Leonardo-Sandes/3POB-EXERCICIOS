import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Funcionario funcionario = new Funcionario("João", 3000.0);
        Gerente gerente = new Gerente("Maria", 5000.0, "TI");

        System.out.println("Digite 1 para exibir os dados do funcionário ou 2 para exibir os dados do gerente:");
        int escolha = leitor.nextInt();

        if(escolha == 1) {
            System.out.println("Dados do Funcionário:");
            funcionario.exibirDados();
        } else if(escolha == 2) {
            System.out.println("Dados do Gerente:");
            gerente.exibirDados();
        } else {
            System.out.println("Opção inválida.");
        }
        leitor.close();
}
}
