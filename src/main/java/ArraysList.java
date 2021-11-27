import java.util.Arrays;

/**
Creates a ArrayList, which can
insert, delete, search numbers.
 */
public class ArraysList {
    private int[] numbers;
    private int count;
    /**
    Creates a instance of ArraysList
    with tha given limit.
    @param limit capacity of the ArrayList.
     */
    public ArraysList(int limit){
        this.numbers = new int[limit];
        this.count = 0 ;
    }

    /**
     Inserts a new value to the end of the array.
     If the array is full,
     increases its capacity by 2 and
     adds the value given at the index of count.
     It does coz array starts from 0 and
     count calculates the number of items in the array.
     */
    public void insertNewValue(int value){
        if(numbers.length == count){                  // to check whether the array is full.
            int[] newNumbers = new int[count*2];      // creates more memory
            for(int i = 0; i < count; i++){           // Copies elements to new array list.
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
        }
        numbers[count] = value;                       //assigns the new value at the end of the list.
        count++;
    }
    /* Todo : implement this method !!!! */
    public void insertNewValueAfterIndexOf(int value, int index){

    }

    /**
     * Removes the value at the given index.
     * It does by starting a for loop from index value
     * and copying values from next index.
     * @param index index of the value to be removed.
     */
    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException("Given index is invalid");

        for(int i = index; i < count; i++)
            numbers[i] = numbers[i+1];

        count--;
    }

    /**
     * Finds the index of the given value
     * @param value value to find index of
     */
    public void indexOf(int value) {
        boolean isFound = false;
        for(int i=0; i< count ; i++){
            if (numbers[i] == value && !isFound) {
                isFound = true;
                System.out.println("The index of the given value is " + i);
            }
        }
        if(!isFound){
            System.out.println("Didnt find the value !");
        }

    }

    @Override
    public String toString() {
        return "numbers=" + Arrays.toString(numbers);
    }
}
