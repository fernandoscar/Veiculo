
public class Caminhao extends Veiculo implements Locavel {

    private double capacidadeCargaKg;


    public Caminhao(String placa, String marca, String modelo, double valorDiaria, double capacidadeCargaKg) {
        // "super(...)" chama o construtor da classe PAI (Veiculo)
        super(placa, marca, modelo, valorDiaria);

        // "this." inicializa o atributo que pertence apenas ao Caminhao
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    // --- 1. Implementação do Método Abstrato (de Veiculo) ---


    @Override
    public double calcularDiariaComDesconto() {
        double valorBase = this.getValorDiaria(); // Herdado de Veiculo
        double acrescimo = valorBase * 0.15; // 15%
        return valorBase + acrescimo;
        // (Ou, de forma mais direta: return this.getValorDiaria() * 1.15;)
    }

    // --- 2. Implementação dos Métodos da Interface (de Locavel) ---


    @Override
    public void iniciarLocacao() {
        this.setStatus(StatusVeiculo.LOCADO); // Herdado de Veiculo
        System.out.println("Caminhão " + this.getModelo() + " foi locado com sucesso.");
    }


    @Override
    public void encerrarLocacao() {
        this.setStatus(StatusVeiculo.DISPONIVEL);
        System.out.println("Caminhão " + this.getModelo() + " foi devolvido e está disponível.");
    }


    @Override
    public boolean verificarDisponibilidade() {
        return this.getStatus() == StatusVeiculo.DISPONIVEL; // Herdado
    }

    // --- 3. Getters e Setters do atributo próprio ---

    public double getCapacidadeCargaKg() {
        return capacidadeCargaKg;
    }

    public void setCapacidadeCargaKg(double capacidadeCargaKg) {
        this.capacidadeCargaKg = capacidadeCargaKg;
    }
}
