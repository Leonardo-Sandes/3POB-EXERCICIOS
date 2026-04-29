public class Main {
    public static void main(String[] args){
    
        Moto moto1 = new Moto();
        moto1.marca = "BMW";
        moto1.modelo = "R1200";
        moto1.cilindradas = 1200;

        System.out.println("EXIBINDO DETALHES DA MOTO");
        moto1.exibirDados();
    }
    
}
