import java.util.Date;
public class Paciente {

    private String nome;
    private String sobrenome;
    private char sexo;
    private int nascimento;
    private byte idade;
    private double altura;
    private double peso;
    private String cpf;
    private double imc;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public char getSexo() {
        return sexo;
    }

    public byte getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getCpf() {
        return cpf;
    }
    public int getNascimento(){
        return nascimento;
    }

    public double getImc() {
        return imc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setImc (double imc ) {this.imc = imc;}

    public void setCpf(String cpf) throws IllegalArgumentException {
        if (cpf == null)
            throw new IllegalArgumentException("O CPF não pode ser vazio");

        if (cpf.matches("^[0-9]"))
            throw new IllegalArgumentException("O CPF possuiu caracteres invalidos, digite somente numeros!");
        this.cpf = cpf;
    }

    //Construtores

    public Paciente (){
         String nome = " ";
         String sobrenome = " ";
         char sexo = '\u0000';
         int nascimento = 0;
         byte idade = 0;
         double altura =  0;
         double peso = 0.0;
         String cpf = " ";
         double imc = 0.0;
    }

    public Paciente(String nome, String sobrenome, char sexo, int nascimento, double altura, double peso, String cpf, double imc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
        this.cpf = cpf;
    }

    public Paciente(String nome, String sobrenome, char sexo, int nascimento, double altura, double peso, double imc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public Paciente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    //Metodos

    public double obterPedoIdeal (){
        if (sexo == 'h')
            return ((72.7 * altura)/100) - 58;
        if (sexo == 'm')
            return ((62.1 *  altura)/100) - 44.7;
        else
            return 0;

    }

    public String obterCpfOfuscado(Paciente paciente){
        String cpf = paciente.getCpf();
        String bloco2 = cpf.substring(3, 6);
        cpf = "***"+"."+bloco2+"."+"***"+"-"+"***";
        return cpf;
    }

    public double calcularImc(){
        //IMC = (peso) / (altura^2)
        return (peso / (altura*altura)) ;
    }

    public double calcularIdade(Paciente paciente){
        Date d = new Date();
        int year = d.getYear();
        int currentYear = year + 1900;
        int idade = currentYear - paciente.nascimento;
        return idade;
    }

    public String validarCpf(Paciente paciente){
        int tamanho = paciente.getCpf().length();
        if (tamanho < 11){
            throw new IllegalArgumentException("O CPF está inválido");
        } else {
            return "CPF válido!";
        }
    }

    public String obterSituacaoIMC(){
        if (imc < 17) {
           return "Muito Abaixo do Peso!";
        } else if (imc > 17 && imc < 18.49 ) {
            return "Abaixo do peso";
        } else if (imc > 18.50 && imc < 24.99){
            return "Peso normal";
        } else if (imc > 25 && imc < 29.99){
            return "Acima do Peso";
        } else if (imc > 30 && imc < 34.99){
            return "Obesidade I";
        } else if (imc > 35 && imc < 39.99){
            return "Obesidade II (severa)";
        } else  {
            return "Obesidade III (morbida)";
        }

    }

}
