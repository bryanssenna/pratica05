import java.util.List;

public class OrdenacaoSelectionSort implements EstrategiaOrdenacao {
    @Override
    public void ordenar(List<Integer> numeros) {
        int n = numeros.size();
        for (int i = 0; i < n - 1; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros.get(j) < numeros.get(menorIndice)) {
                    menorIndice = j;
                }
            }
            // Troca
            int temp = numeros.get(menorIndice);
            numeros.set(menorIndice, numeros.get(i));
            numeros.set(i, temp);
        }
    }
}
