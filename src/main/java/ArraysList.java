import java.util.Arrays;

/*
Creates a ArrayList, which can
insert, delete, search numbers.
 */
public class ArraysList {
    private int[] numbers;
    private int count;
    /*
    Creates a instance of ArraysList
    with tha given limit.
    @param limit capacity of the ArrayList.
     */
    public ArraysList(int limit){
        this.numbers = new int[limit];
        this.count = 0 ;
    }

    /*
    Inserts a new value to the end of the array.
    If the array is full,
    increases its capacity and
    add the value given.
     */
    public void insertNewValue(int value){
        if(numbers.length == count){
            int[] newNumbers = new int[count + 1];
            for(int i = 0; i < count; i++){
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
        }
        numbers[count] = value;
        count++;
    }

    @Override
    public String toString() {
        return "numbers=" + Arrays.toString(numbers);
    }
}
