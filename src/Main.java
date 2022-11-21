public class Main {
    public static void main(String[] args) {

        Paciente fabricio = new Paciente("fabricio", "vaz", 'h',  2004, (short) 123, 55);
        Paciente jessica = new Paciente("Jessica", "Assis", "0095403655");
        double pesoIdeal = fabricio.obterPedoIdeal(fabricio);
        System.out.printf("%.2f", pesoIdeal);
        System.out.println(" ");
        System.out.print(jessica.obterCpfOfuscado(jessica));
        System.out.println();
        System.out.println(fabricio.calcularImc()+" imc");
        System.out.println((int)fabricio.calcularIdade(fabricio) + " anos");
        System.out.println(jessica.validarCpf(jessica));
    }
}