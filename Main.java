package atv02;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {100000, 1000000};
        Random rand = new Random();

        for (int size : sizes) {
            int[] array = rand.ints(size, 1, 1000001).toArray();

            System.out.println("=== TAMANHO: " + size + " ===\n");

            // CRESCENTE
            System.out.println("CRESCENTE:");
            int[] arrayCopy = array.clone();
            SortResult bubbleSortResult = Crescente.bubbleSort(arrayCopy);
            System.out.println("Bubble Sort - Trocas: " + bubbleSortResult.swaps + ", Comparacoes: " + bubbleSortResult.comparisons + ", Tempo: " + bubbleSortResult.time + " ms (" + bubbleSortResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult insertionSortResult = Crescente.insertionSort(arrayCopy);
            System.out.println("Insertion Sort - Trocas: " + insertionSortResult.swaps + ", Comparacoes: " + insertionSortResult.comparisons + ", Tempo: " + insertionSortResult.time + " ms (" + insertionSortResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult selectionSortResult = Crescente.selectionSort(arrayCopy);
            System.out.println("Selection Sort - Trocas: " + selectionSortResult.swaps + ", Comparacoes: " + selectionSortResult.comparisons + ", Tempo: " + selectionSortResult.time + " ms (" + selectionSortResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult mergeSortResult = Crescente.mergeSort(arrayCopy);
            System.out.println("Merge Sort - Trocas: " + mergeSortResult.swaps + ", Comparacoes: " + mergeSortResult.comparisons + ", Tempo: " + mergeSortResult.time + " ms (" + mergeSortResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult quickSortResult = Crescente.quickSort(arrayCopy);
            System.out.println("Quick Sort - Trocas: " + quickSortResult.swaps + ", Comparacoes: " + quickSortResult.comparisons + ", Tempo: " + quickSortResult.time + " ms (" + quickSortResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult bucketSortResult = Crescente.bucketSort(arrayCopy);
            System.out.println("Bucket Sort - Trocas: " + bucketSortResult.swaps + ", Comparacoes: " + bucketSortResult.comparisons + ", Tempo: " + bucketSortResult.time + " ms (" + bucketSortResult.getTimeInSeconds() + " s)");

            // DECRESCENTE
            System.out.println("\nINVERTIDO:");
            arrayCopy = array.clone();
            SortResult bubbleSortDescResult = Decrescente.bubbleSortDescending(arrayCopy);
            System.out.println("Bubble Sort Decrescente - Trocas: " + bubbleSortDescResult.swaps + ", Comparacoes: " + bubbleSortDescResult.comparisons + ", Tempo: " + bubbleSortDescResult.time + " ms (" + bubbleSortDescResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult insertionSortDescResult = Decrescente.insertionSortDescending(arrayCopy);
            System.out.println("Insertion Sort Decrescente - Trocas: " + insertionSortDescResult.swaps + ", Comparacoes: " + insertionSortDescResult.comparisons + ", Tempo: " + insertionSortDescResult.time + " ms (" + insertionSortDescResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult selectionSortDescResult = Decrescente.selectionSortDescending(arrayCopy);
            System.out.println("Selection Sort Decrescente - Trocas: " + selectionSortDescResult.swaps + ", Comparacoes: " + selectionSortDescResult.comparisons + ", Tempo: " + selectionSortDescResult.time + " ms (" + selectionSortDescResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult mergeSortDescResult = Decrescente.mergeSortDescending(arrayCopy);
            System.out.println("Merge Sort Decrescente - Trocas: " + mergeSortDescResult.swaps + ", Comparacoes: " + mergeSortDescResult.comparisons + ", Tempo: " + mergeSortDescResult.time + " ms (" + mergeSortDescResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult quickSortDescResult = Decrescente.quickSortDescending(arrayCopy);
            System.out.println("Quick Sort Decrescente - Trocas: " + quickSortDescResult.swaps + ", Comparacoes: " + quickSortDescResult.comparisons + ", Tempo: " + quickSortDescResult.time + " ms (" + quickSortDescResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult bucketSortDescResult = Decrescente.bucketSortDescending(arrayCopy);
            System.out.println("Bucket Sort Decrescente - Trocas: " + bucketSortDescResult.swaps + ", Comparacoes: " + bucketSortDescResult.comparisons + ", Tempo: " + bucketSortDescResult.time + " ms (" + bucketSortDescResult.getTimeInSeconds() + " s)");

            // ALEATORIO
            System.out.println("\nALEATORIO:");
            arrayCopy = array.clone();
            SortResult bubbleSortRandResult = Aleatorio.bubbleSortRandom(arrayCopy);
            System.out.println("Bubble Sort Aleatório - Trocas: " + bubbleSortRandResult.swaps + ", Comparacoes: " + bubbleSortRandResult.comparisons + ", Tempo: " + bubbleSortRandResult.time + " ms (" + bubbleSortRandResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult insertionSortRandResult = Aleatorio.insertionSortRandom(arrayCopy);
            System.out.println("Insertion Sort Aleatório - Trocas: " + insertionSortRandResult.swaps + ", Comparacoes: " + insertionSortRandResult.comparisons + ", Tempo: " + insertionSortRandResult.time + " ms (" + insertionSortRandResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult selectionSortRandResult = Aleatorio.selectionSortRandom(arrayCopy);
            System.out.println("Selection Sort Aleatório - Trocas: " + selectionSortRandResult.swaps + ", Comparacoes: " + selectionSortRandResult.comparisons + ", Tempo: " + selectionSortRandResult.time + " ms (" + selectionSortRandResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult mergeSortRandResult = Aleatorio.mergeSortRandom(arrayCopy);
            System.out.println("Merge Sort Aleatório - Trocas: " + mergeSortRandResult.swaps + ", Comparacoes: " + mergeSortRandResult.comparisons + ", Tempo: " + mergeSortRandResult.time + " ms (" + mergeSortRandResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult quickSortRandResult = Aleatorio.quickSortRandom(arrayCopy);
            System.out.println("Quick Sort Aleatório - Trocas: " + quickSortRandResult.swaps + ", Comparacoes: " + quickSortRandResult.comparisons + ", Tempo: " + quickSortRandResult.time + " ms (" + quickSortRandResult.getTimeInSeconds() + " s)");

            arrayCopy = array.clone();
            SortResult bucketSortRandResult = Aleatorio.bucketSortRandom(arrayCopy);
            System.out.println("Bucket Sort Aleatório - Trocas: " + bucketSortRandResult.swaps + ", Comparacoes: " + bucketSortRandResult.comparisons + ", Tempo: " + bucketSortRandResult.time + " ms (" + bucketSortRandResult.getTimeInSeconds() + " s)");

            // COUNTINGSORT
            System.out.println("\nCOUNTINGSORT:");
            System.out.println("Aleatório:");
            arrayCopy = array.clone();
            SortResult countingSortResult = CountingSort.countingSort(arrayCopy);
            System.out.println("Counting Sort - Aleatório - Trocas: " + countingSortResult.swaps + ", Comparações: " + countingSortResult.comparisons + ", Tempo: " + countingSortResult.time + " ms (" + countingSortResult.getTimeInSeconds() + " s)");

            System.out.println("Ordem crescente:");
            arrayCopy = array.clone();
            java.util.Arrays.sort(arrayCopy);
            countingSortResult = CountingSort.countingSort(arrayCopy);
            System.out.println("Counting Sort - Crescente - Trocas: " + countingSortResult.swaps + ", Comparações: " + countingSortResult.comparisons + ", Tempo: " + countingSortResult.time + " ms (" + countingSortResult.getTimeInSeconds() + " s)");

            System.out.println("Ordem decrescente:");
            arrayCopy = array.clone();
            java.util.Arrays.sort(arrayCopy);
            reverseArray(arrayCopy);
            countingSortResult = CountingSort.countingSortDecrescente(arrayCopy);
            System.out.println("Counting Sort - Decrescente - Trocas: " + countingSortResult.swaps + ", Comparações: " + countingSortResult.comparisons + ", Tempo: " + countingSortResult.time + " ms (" + countingSortResult.getTimeInSeconds() + " s)");

            System.out.println("\n" + "=".repeat(50) + "\n");
        }
    }

    private static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
