import java.util.Arrays;

public class Uke3Array {
    private int numbers[];
    private int count = 0;

    public Uke3Array(int limit){
        numbers = new int[limit];

    }
    public void print(){
        if(count == 0){
            System.out.println("Ingen elementer i Array");
        }else {
            System.out.println("Elementer i array er ...");
            System.out.println(Arrays.toString(numbers));
        }
    }

    public void insert(int value){

        if(numbers.length == count) {
            int[] newNumbers = new int[count + 1];

            for (int i = 0; i < count; i++) {
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
        }
        numbers[count] = value;
        count++;
    }

    public static void main(String[] args) {
       Uke3Array uke3Array = new Uke3Array(3);
       uke3Array.print();
       uke3Array.insert(10);
       uke3Array.insert(20);
       uke3Array.insert(30);
       uke3Array.insert(40);
       uke3Array.print();
    }
}
