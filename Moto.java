
public class Moto extends Veiculo implements Locavel {


    private int cilindradas;


    public Moto(String placa, String marca, String modelo, double valorDiaria, int cilindradas) {
        // "super(...)" chama o construtor da classe PAI (Veiculo)
        super(placa, marca, modelo, valorDiaria);

        // "this." inicializa o atributo que pertence apenas à Moto
        this.cilindradas = cilindradas;
    }

    // --- 1. Implementação do Método Abstrato (de Veiculo) ---


    @Override
    public double calcularDiariaComDesconto() {
        double valorBase = this.getValorDiaria(); // Herdado de Veiculo

        // Verificando a condição das cilindradas
        if (this.cilindradas <= 200) {
            // Se for até 200cc, aplica 5% de desconto
            double desconto = valorBase * 0.05; // 5%
            return valorBase - desconto;
        } else {
            // Se tiver mais de 200cc, não há desconto.
            return valorBase;
        }
    }

    // --- 2. Implementação dos Métodos da Interface (de Locavel) ---


    @Override
    public void iniciarLocacao() {
        this.setStatus(StatusVeiculo.LOCADO); // setStatus é herdado de Veiculo
        System.out.println("Moto " + this.getModelo() + " foi locada com sucesso.");
    }


    @Override
    public void encerrarLocacao() {
        this.setStatus(StatusVeiculo.DISPONIVEL);
        System.out.println("Moto " + this.getModelo() + " foi devolvida e está disponível.");
    }


    @Override
    public boolean verificarDisponibilidade() {
        return this.getStatus() == StatusVeiculo.DISPONIVEL; // getStatus é herdado
    }

    // --- 3. Getters e Setters do atributo próprio ---

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
