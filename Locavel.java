/**
 * Interface (Contrato) que define os comportamentos obrigatórios
 * para qualquer veículo que possa ser alugado.
 * Criado conforme o item 3 da tarefa.
 */
public interface Locavel {

    /**
     * Define a taxa de seguro padrão, em porcentagem (ex: 5.0 para 5%).
     * Conforme item 3.
     */
    double TAXA_SEGURO = 5.0;

    /**
     * Altera o status do veículo para LOCADO.
     * Conforme item 3.
     */
    void iniciarLocacao();

    /**
     * Altera o status do veículo para DISPONIVEL.
     * Conforme item 3.
     */
    void encerrarLocacao();

    /**
     * Verifica se o veículo está atualmente DISPONIVEL.
     * Conforme item 3.
     *
     * @return true se o status for DISPONIVEL, false caso contrário.
     */
    boolean verificarDisponibilidade();

    /**
     * Contrato para obter o valor da diária do veículo.
     * Essencial para que a interface possa ter um método default
     * que dependa desse valor.
     */
    double getValorDiaria();

    /**
     * Calcula o valor do seguro com base na taxa padrão.
     * Este é um método "default", o que significa que ele já tem uma
     * implementação padrão e as classes que implementam a interface
     * não são obrigadas a reescrevê-lo.
     * Conforme item 3.
     *
     * @return O valor do seguro a ser adicionado.
     */
    default double calcularSeguro() {
        // A taxa é em porcentagem, então dividimos por 100.
        return getValorDiaria() * (TAXA_SEGURO / 100);
    }
}
