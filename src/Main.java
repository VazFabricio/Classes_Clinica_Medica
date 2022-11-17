public class Main {
    public static void main(String[] args) {

        Paciente fabricio = new Paciente("fabricio", "vaz", 'h', (byte) 27, (short) 123, 55);
        Paciente jessica = new Paciente("Jessica", "Assis", "70095403655");
        double pesoIdeal = fabricio.obterPedoIdeal(fabricio);
        System.out.printf("%.2f", pesoIdeal);
        System.out.println(" ");
        System.out.print(jessica.obterCpfOfuscado(jessica));
        System.out.println();
        System.out.println(fabricio.calcularImc());
    }
}