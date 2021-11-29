import java.util.Scanner;

public class Uke2 {
    public static void main(String[] args) {

    }
    public static void sumOfThreeNumbers(int noOfNumbersToAdd){
        int sum = 0;
        System.out.println("Enter " + noOfNumbersToAdd +" numbers : ");
        for(int i=1 ; i<= noOfNumbersToAdd;i++) {
            Scanner scanner = new Scanner(System.in);
            sum = sum + scanner.nextInt();
        }
        System.out.println("The total of given numbers is :" + sum);
    }

    public static void printTriangle(int sizeOfTriangle){
        for(int i = 1; i <= sizeOfTriangle; i++)
        {
            for(int j = 1; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
