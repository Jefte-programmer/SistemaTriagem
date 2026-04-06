public class Enfermeiro extends ProfissionalSaude {
    public Enfermeiro(String nome, String cpf, int anoNascimento, String genero, String registroConselho) {
        super(nome, cpf, anoNascimento, genero, registroConselho);
    }

    public String assinarFicha() {
        return "Assinado digitalmente pelo Enf." + this.getNome() + "(COREN: " + this.getRegistroConselho() + ")";
    }
}
