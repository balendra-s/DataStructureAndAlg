public class Main {
    public static void main(String[] args) {
        ArraysList arrays = new ArraysList(2);

        //Inserting new values to the arraylist
        arrays.insertNewValue(10);
        arrays.insertNewValue(20);
        arrays.insertNewValue(30);
        arrays.insertNewValue(30);
        arrays.insertNewValue(40);
        System.out.println(arrays.toString());

        //Removing a value at the given index and rearranging the array.
        try{
            arrays.removeAt(0);
            System.out.println("Removed successfully !");
            System.out.println("After removing ....");
            System.out.println(arrays.toString());
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        //Finding index of a given value.
        arrays.indexOf(200);

    }
}
