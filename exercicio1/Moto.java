public class Moto extends Veiculo {
    protected int cilindradas;

    @Override
    public void exibirDados() {
        super.exibirDados(); 
        System.out.println("A cilindrada da moto é: " + cilindradas);
    }
}
