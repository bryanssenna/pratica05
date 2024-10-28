import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContextoDeOrdenacao contexto = new ContextoDeOrdenacao();
        List<Integer> numeros = new ArrayList<>();

        // Lendo números do usuário
        System.out.println("Digite os números para ordenação (separe com espaço):");
        String[] entrada = scanner.nextLine().split(" ");
        for (String s : entrada) {
            numeros.add(Integer.parseInt(s));
        }

        // Escolhendo a estratégia
        System.out.println("Escolha a estratégia de ordenação:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                contexto.setEstrategia(new OrdenacaoBubbleSort());
                break;
            case 2:
                contexto.setEstrategia(new OrdenacaoSelectionSort());
                break;
            case 3:
                contexto.setEstrategia(new OrdenacaoInsertionSort());
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        // Executando a ordenação e exibindo o resultado
        contexto.executarOrdenacao(numeros);
        System.out.println("Números ordenados: " + numeros);
    }
}
