public abstract class Paciente extends Pessoa {

    protected int batimentosPorMinuto;
    protected String pressaoArterial;
    protected double temperatura;

    public Paciente(String nome, String cpf, int anoNascimento, String genero, int batimentosPorMinuto,
            String pressaoArterial, double temperatura) {
        super(nome, cpf, anoNascimento, genero);
        this.batimentosPorMinuto = batimentosPorMinuto;
        this.pressaoArterial = pressaoArterial;
        this.temperatura = temperatura;
    }

    public int getBatimentosPorMinuto() {
        return batimentosPorMinuto;
    }

    public String getPressaoArterial() {
        return pressaoArterial;
    }

    public double getTemperatura() {
        return temperatura;
    }

    abstract int calcularAgravanteRisco();

}
