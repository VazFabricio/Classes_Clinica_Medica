public class Main {
    public static void main(String[] args) {

        Paciente fabricio = new Paciente("fabricio", "vaz", 'h',  2004, 1.70, 55, 0.0);
        Paciente jessica = new Paciente("Jessica", "Assis", "70095403655");
        double pesoIdeal = fabricio.obterPedoIdeal();
        System.out.printf("%.2f", pesoIdeal);
        System.out.println(" ");
        System.out.print(jessica.obterCpfOfuscado(jessica));
        System.out.println();
        System.out.printf("%.2f", fabricio.calcularImc());
        System.out.println();
        fabricio.setImc(fabricio.calcularImc());
        System.out.println((int)fabricio.calcularIdade(fabricio) + " anos");
        System.out.println(jessica.validarCpf(jessica));
        System.out.println(fabricio.obterSituacaoIMC());
    }
}