import java.util.Scanner;

public class Uke2 {
    public static void main(String[] args) {
        //Uke2.sumOfThreeNumbers(4);
        //Uke2.printTriangle(10);
        System.out.println(Uke2.whileLoopCount(10));
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

    public static int whileLoopCount(int limit){

        int i = 1;
        while(i <= limit){
            i++;
        }
        return i;
    }
}
