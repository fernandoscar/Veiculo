
public class Carro extends Veiculo implements Locavel {


    private int numeroDePortas;


    public Carro(String placa, String marca, String modelo, double valorDiaria, int numeroDePortas) {
        // "super(...)" chama o construtor da classe PAI (Veiculo)
        // para inicializar os atributos que são herdados.
        super(placa, marca, modelo, valorDiaria);

        // "this." inicializa o atributo que pertence apenas ao Carro.
        this.numeroDePortas = numeroDePortas;
    }

    // --- 1. Implementação do Método Abstrato (de Veiculo) ---


    @Override
    public double calcularDiariaComDesconto() {
        // getValorDiaria() é um método herdado de Veiculo
        double valorBase = this.getValorDiaria();
        double desconto = valorBase * 0.10; // 10%
        return valorBase - desconto;
        // (Ou, de forma mais direta: return this.getValorDiaria() * 0.90;)
    }

    // --- 2. Implementação dos Métodos da Interface (de Locavel) ---


    @Override
    public void iniciarLocacao() {
        // setStatus() é um método herdado de Veiculo
        this.setStatus(StatusVeiculo.LOCADO);
        System.out.println("Carro " + this.getModelo() + " foi locado com sucesso.");
    }


    @Override
    public void encerrarLocacao() {
        this.setStatus(StatusVeiculo.DISPONIVEL);
        System.out.println("Carro " + this.getModelo() + " foi devolvido e está disponível.");
    }


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
