public class PacienteGestante extends Paciente {

    private int mesesgestacao;

    public PacienteGestante(String nome, String cpf, int anoNascimento, String genero, int batimentosPorMinuto,
            String pressaoArterial, double temperatura, int mesesgestacao) {
        super(nome, cpf, anoNascimento, genero, batimentosPorMinuto, pressaoArterial, temperatura);
        this.mesesgestacao = mesesgestacao;
    }

    @Override
    public int calcularAgravanteRisco() {

        if (mesesgestacao >= 7 && mesesgestacao <= 9) {
            return 2;
        } else if (mesesgestacao <= 6 && mesesgestacao >= 4) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getMesesGestacao() {
        return mesesgestacao;
    }
}
