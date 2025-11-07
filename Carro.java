/**
 * Classe Concreta para "Carro".
 * Conforme Item 2 do PDF.
 *
 * 1. Herda de Veiculo (extends Veiculo)
 * 2. Implementa a interface Locavel (implements Locavel)
 */
public class Carro extends Veiculo implements Locavel {

    /**
     * Atributo próprio da classe Carro (Item 2.24)
     */
    private int numeroDePortas;

    /**
     * Construtor da classe Carro.
     * Ele recebe os dados do Carro e também os dados que o "Veiculo" (pai) precisa.
     */
    public Carro(String placa, String marca, String modelo, double valorDiaria, int numeroDePortas) {
        // "super(...)" chama o construtor da classe PAI (Veiculo)
        // para inicializar os atributos que são herdados.
        super(placa, marca, modelo, valorDiaria);

        // "this." inicializa o atributo que pertence apenas ao Carro.
        this.numeroDePortas = numeroDePortas;
    }

    // --- 1. Implementação do Método Abstrato (de Veiculo) ---

    /**
     * Implementação específica para Carro.
     * Regra: Aplica 10% de desconto sobre o valor da diária.
     * (Item 2.25)
     */
    @Override
    public double calcularDiariaComDesconto() {
        // getValorDiaria() é um método herdado de Veiculo
        double valorBase = this.getValorDiaria();
        double desconto = valorBase * 0.10; // 10%
        return valorBase - desconto;
        // (Ou, de forma mais direta: return this.getValorDiaria() * 0.90;)
    }

    // --- 2. Implementação dos Métodos da Interface (de Locavel) ---

    /**
     * Implementa o contrato 'iniciarLocacao' da interface Locavel.
     * Altera o status para LOCADO.
     */
    @Override
    public void iniciarLocacao() {
        // setStatus() é um método herdado de Veiculo
        this.setStatus(StatusVeiculo.LOCADO);
        System.out.println("Carro " + this.getModelo() + " foi locado com sucesso.");
    }

    /**
     * Implementa o contrato 'encerrarLocacao' da interface Locavel.
     * Altera o status para DISPONIVEL.
     */
    @Override
    public void encerrarLocacao() {
        this.setStatus(StatusVeiculo.DISPONIVEL);
        System.out.println("Carro " + this.getModelo() + " foi devolvido e está disponível.");
    }

    /**
     * Implementa o contrato 'verificarDisponibilidade' da interface Locavel.
     * Retorna true se o status for DISPONIVEL.
     */
    @Override
    public boolean verificarDisponibilidade() {
        // getStatus() é um método herdado de Veiculo
        return this.getStatus() == StatusVeiculo.DISPONIVEL;
    }

    // --- 3. Getters e Setters do atributo próprio ---

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
}
