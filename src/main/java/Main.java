public class Main {
    public static void main(String[] args) {
        ArraysList arrays = new ArraysList(2);
        arrays.insertNewValue(10);
        arrays.insertNewValue(20);
        arrays.insertNewValue(30);
        arrays.insertNewValue(30);
        System.out.println(arrays.toString());
    }
}
