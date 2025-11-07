public class Main {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("--- Sistema de Locação de Veículos ---");
        System.out.println("=========================================");
        System.out.println("\n");

        // --- 1. Criar objetos ---
        Carro carro1 = new Carro("ABC1234", "Fiat", "Uno", 100.0, 4);
        Moto moto1 = new Moto("DEF5678", "Honda", "Biz", 80.0, 125); // 125cc (terá desconto)
        Caminhao caminhao1 = new Caminhao("GHI9012", "Volvo", "FH 540", 500.0, 20000.0);

        // --- 2. Exibir status inicial ---
        System.out.println("--- 2. Status Inicial ---");
        System.out.println("Status inicial do Carro: " + carro1.getStatus());
        System.out.println("Status inicial da Moto: " + moto1.getStatus());
        System.out.println("Status inicial do Caminhão: " + caminhao1.getStatus());
        System.out.println("\n");

        // --- 3. Testar locação ---
        System.out.println("--- 3. Testando Locação ---");

        // Testando o Carro
        carro1.iniciarLocacao();
        System.out.println("Status do Carro após locar: " + carro1.getStatus());
        System.out.println("Disponível? " + carro1.verificarDisponibilidade());
        carro1.encerrarLocacao();
        System.out.println("Status do Carro após devolver: " + carro1.getStatus());
        System.out.println("Disponível? " + carro1.verificarDisponibilidade());
        System.out.println("-----");

        // Testando a Moto
        moto1.iniciarLocacao();
        System.out.println("Status da Moto após locar: " + moto1.getStatus());
        moto1.encerrarLocacao();
        System.out.println("Status da Moto após devolver: " + moto1.getStatus());
        System.out.println("-----");

        // Testando o Caminhão
        System.out.println("Disponibilidade do Caminhão: " + caminhao1.verificarDisponibilidade());
        System.out.println("\n");

        // --- 4. Calcular diárias com desconto ---
        System.out.println("--- 4. Cálculo das Diárias ---");

        // Carro: R$100.00 com 10% de desconto
        System.out.println("Diária (base) do Carro: R$" + carro1.getValorDiaria());
        System.out.println("Diária (com desconto) do Carro: R$" + carro1.calcularDiariaComDesconto());

        // Moto: R$80.00 com 5% de desconto (pois tem 125cc)
        System.out.println("Diária (base) da Moto: R$" + moto1.getValorDiaria());
        System.out.println("Diária (com desconto) da Moto: R$" + moto1.calcularDiariaComDesconto());

        // Caminhão: R$500.00 com 15% de acréscimo
        System.out.println("Diária (base) do Caminhão: R$" + caminhao1.getValorDiaria());
        System.out.println("Diária (com acréscimo) do Caminhão: R$" + caminhao1.calcularDiariaComDesconto());
    }
}
