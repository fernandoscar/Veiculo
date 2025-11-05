/**
 * Classe Concreta para "Caminhao".
 * Conforme Item 2 do PDF.
 *
 * 1. Herda de Veiculo (extends Veiculo)
 * 2. Implementa a interface Locavel (implements Locavel)
 */
public class Caminhao extends Veiculo implements Locavel {

    /**
     * Atributo próprio da classe Caminhao (Item 2.24)
     */
    private double capacidadeCargaKg;

    /**
     * Construtor da classe Caminhao.
     */
    public Caminhao(String placa, String marca, String modelo, double valorDiaria, double capacidadeCargaKg) {
        // "super(...)" chama o construtor da classe PAI (Veiculo)
        super(placa, marca, modelo, valorDiaria);

        // "this." inicializa o atributo que pertence apenas ao Caminhao
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    // --- 1. Implementação do Método Abstrato (de Veiculo) ---

    /**
     * Implementação específica para Caminhao.
     * Regra (Item 2.30): aplica ACRÉSCIMO de 15% sobre o valor da diária.
     */
    @Override
    public double calcularDiariaComDesconto() {
        double valorBase = this.getValorDiaria(); // Herdado de Veiculo
        double acrescimo = valorBase * 0.15; // 15%
        return valorBase + acrescimo;
        // (Ou, de forma mais direta: return this.getValorDiaria() * 1.15;)
    }

    // --- 2. Implementação dos Métodos da Interface (de Locavel) ---

    /**
     * Implementa o contrato 'iniciarLocacao' da interface Locavel.
     * Altera o status para LOCADO.
     */
    @Override
    public void iniciarLocacao() {
        this.setStatus(StatusVeiculo.LOCADO); // Herdado de Veiculo
        System.out.println("Caminhão " + this.getModelo() + " foi locado com sucesso.");
    }

    /**
     * Implementa o contrato 'encerrarLocacao' da interface Locavel.
     * Altera o status para DISPONIVEL.
     */
    @Override
    public void encerrarLocacao() {
        this.setStatus(StatusVeiculo.DISPONIVEL);
        System.out.println("Caminhão " + this.getModelo() + " foi devolvido e está disponível.");
    }

    /**
     * Implementa o contrato 'verificarDisponibilidade' da interface Locavel.
     * Retorna true se o status for DISPONIVEL.
     */
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
