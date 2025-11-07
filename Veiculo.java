/**
 * Classe Abstrata que serve como modelo (molde) genérico
 * para todos os veículos do sistema.
 * Criado conforme o item 1 da tarefa.
 */
public abstract class Veiculo {

    // --- 1. Atributos Obrigatórios (Item 1) ---
    private String placa;
    private String marca;
    private String modelo;
    private double valorDiaria;
    private StatusVeiculo status; // (Item 1.15) - Usando o Enum que criamos

    // --- 2. Construtor (Item 1.17) ---
    /**
     * Construtor para inicializar os atributos básicos de um veículo.
     * O status inicial de todo veículo novo será DISPONIVEL.
     */
    public Veiculo(String placa, String marca, String modelo, double valorDiaria) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.status = StatusVeiculo.DISPONIVEL; // Todo veículo começa como DISPONIVEL
    }

    // --- 3. Método Abstrato (Item 1.19) ---
    /**
     * Um método abstrato força as classes filhas (Carro, Moto, etc.)
     * a implementar sua própria lógica de cálculo.
     *
     * @return O valor final da diária com o desconto/acréscimo específico.
     */
    public abstract double calcularDiariaComDesconto();

    // --- 4. Método Concreto (Item 1.20) ---
    /**
     * Exibe um resumo simples das informações do veículo no console.
     */
    public void exibirResumo() {
        System.out.println("--- Resumo do Veículo ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Placa: " + this.placa);
        System.out.println("Valor Diária (Base): R$" + this.valorDiaria);
        System.out.println("Status Atual: " + this.status);
    }

    // --- 5. Getters e Setters (Item 1.18) ---
    // Métodos de acesso para ler e modificar os atributos privados.

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public StatusVeiculo getStatus() {
        return status;
    }

    public void setStatus(StatusVeiculo status) {
        this.status = status;
    }
}
