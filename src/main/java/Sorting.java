import java.util.Arrays;

public class Sorting {

    private static void insertionSort(int[] numbers){
        for(int i = 1;i<numbers.length;i++){
            int current = numbers[i];
            int j= i-1;
            while( j >= 0 && current < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j+1]= current;
            }
    }

    /**
     * It selects the first item as the minimum,
     * compares it with the rest av list and
     * finds the minimum and moves it to the "sorted array".
     * Then checks the last number in the sorted array
     * with the unsorted array and find a minimum.
     * Then it repeats, until everything is sorted.
     * @param numbers numbers to be sorted
     */
    private static void selectionSort(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            int minIndex = i;
            for(int j=i;j<numbers.length;j++){
                if(numbers[minIndex] > numbers[j]){
                    int temp = numbers[minIndex];
                    numbers[minIndex] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
    private static void binarySort(int[] numbers) {
        boolean isSorted;
        for (int i = 0; i < numbers.length; i++) {
            isSorted = true;
            for (int j = 1; j < numbers.length - i ; j++) {
                if (numbers[j] < numbers[j-1]) {
                    int temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                    isSorted = false;
                }
                }
            if(isSorted){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 1,2};
        Sorting.selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
