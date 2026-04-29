public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Leo", 1000.0, 500.0);
        ContaPoupança contaPoupança = new ContaPoupança(0.02);

        System.out.println("Conta Corrente:");
        contaCorrente.exibirSaldo();
        contaCorrente.sacar(1200.0);
        contaCorrente.exibirSaldo();

        System.out.println("\nConta Poupança:");
        double valorSaque = 100.0;
        double valorComTaxa = contaPoupança.calcularTaxaSaque(valorSaque);
        System.out.println("Valor a ser sacado: R$ " + valorSaque);
        System.out.println("Valor após aplicação da taxa: R$ " + valorComTaxa);
    }
}
