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
}
