public class PacienteAdulto extends Paciente {

    public PacienteAdulto(String nome, String cpf, int anoNascimento, String genero, int batimentosPorMinuto,
            String pressaoArterial, double temperatura) {
        super(nome, cpf, anoNascimento, genero, batimentosPorMinuto, pressaoArterial, temperatura);
    }

    @Override
    public int calcularAgravanteRisco() {
        if (2026 - this.anoNascimento >= 65) {
            return 2;
        } else if (2026 - this.anoNascimento >= 50) {
            return 1;
        } else {
            return 0;
        }
    }
}