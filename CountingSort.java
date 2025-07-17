package atv02;
import java.util.Arrays;
import java.util.Random;

public class CountingSort {

	public static SortResult countingSort(int[] array) {
	    long startTime = System.currentTimeMillis();
	    int max = getMax(array);
	    int min = getMin(array);
	    int range = max - min + 1;
	    int[] count = new int[range];
	    int[] output = new int[array.length];
	    long comparisons = 0;
	    int swaps = 0 ;

	    // Contagem de comparações durante o preenchimento do array de contagem
	    for (int i = 0; i < array.length; i++) {
	        comparisons++;
	        swaps++;
	        count[array[i] - min]++;
	    }

	    // Contagem de comparações durante a soma cumulativa no array de contagem
	    for (int i = 1; i < count.length; i++) {
	        comparisons++;
	        swaps++;
	        count[i] += count[i - 1];
	    }

	    // Montagem do array de saída com base no array de contagem
	    for (int i = array.length - 1; i >= 0; i--) {
	    	swaps++;
	    	swaps++;
	        comparisons += 2; // Contagens ao acessar o array original e o array de contagem
	        output[count[array[i] - min] - 1] = array[i];
	        count[array[i] - min]--;
	    }

	

	    long endTime = System.currentTimeMillis();
	    return new SortResult(0, comparisons, endTime - startTime); // Zero trocas
	}


	public static SortResult countingSortDecrescente(int[] array) {
	    long startTime = System.currentTimeMillis();
	    long swaps = 0;
	    long comparisons = 0;
	    
	    if (array.length <= 1) {
	        long endTime = System.currentTimeMillis();
	        return new SortResult(swaps, comparisons, endTime - startTime);
	    }
	    
	    // Encontrar o valor máximo e mínimo
	    int max = array[0];
	    int min = array[0];
	    
	    for (int i = 1; i < array.length; i++) {
	        comparisons++;
	        if (array[i] > max) {
	            max = array[i];
	        }
	        comparisons++;
	        if (array[i] < min) {
	            min = array[i];
	        }
	    }
	    
	    // Criar array de contagem
	    int range = max - min + 1;
	    int[] count = new int[range];
	    
	    // Contar ocorrências de cada elemento
	    for (int i = 0; i < array.length; i++) {
	        count[array[i] - min]++;
	        comparisons++;
	    }
	    
	    // Reconstruir o array em ordem decrescente
	    int index = 0;
	    for (int i = range - 1; i >= 0; i--) {
	        while (count[i] > 0) {
	            array[index] = i + min;
	            index++;
	            count[i]--;
	        }
	        comparisons++;
	    }
	    comparisons++; // última vez em que o while falha
	    
	    long endTime = System.currentTimeMillis();
	    return new SortResult(swaps, comparisons, endTime - startTime);
	}
	
    private static int getMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static int getMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

}