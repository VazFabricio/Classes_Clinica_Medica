public class Paciente {

    private String nome;
    private String sobrenome;
    private char sexo;
    private byte idade;
    private short altura;
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

    public short getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getCpf() {
        return cpf;
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

    public void setAltura(short altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

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
         byte idade = 0;
         short altura = 0;
         double peso = 0.0;
         String cpf = " ";
         double imc = 0.0;
    }

    public Paciente(String nome, String sobrenome, char sexo, byte idade, short altura, double peso, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.cpf = cpf;
    }

    public Paciente(String nome, String sobrenome, char sexo, byte idade, short altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Paciente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    //Metodos

    public double obterPedoIdeal (Paciente paciente){
        short altura = paciente.getAltura();
        char sexo = paciente.getSexo();
        if (sexo == 'h')
            return ((72.7 * altura)/100) - 58;
        if (sexo == 'm')
            return ((62.1 *  altura)/100) - 44.7;
        else
            return 0;

    }

    public String obterCpfOfuscado(Paciente paciente){
        String cpf = paciente.getCpf();
        String bloco1 = cpf.substring(0, 3);
        String bloco2 = cpf.substring(3, 6);
        String bloco3 = cpf.substring(6, 9);
        String bloco4 = cpf.substring(9, 11);

        cpf = "***"+"."+bloco2+"."+"***"+"-"+"***";
        return cpf;
    }

    public double calcularImc(){
        //IMC = (peso) / (altura^2)
        return  this.peso  /  ((this.altura/100)  *  (this.altura/100));
    }

}
