public abstract class Pessoa {

    protected String nome;
    protected String cpf;
    protected int anoNascimento;
    protected String genero;

    public Pessoa(String nome, String cpf, int anoNascimento, String genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String getGenero() {
        return genero;
    }

}