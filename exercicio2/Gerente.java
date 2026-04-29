public class Gerente extends Funcionario {
    private String departamento;
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public double calcularBonus() {
        return salario * 1.2; 
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Departamento: " + departamento);
        System.out.println("O gerente tem um bonos de 20% do salário, o que equivale a: " + calcularBonus());
    }
}