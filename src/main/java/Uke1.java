public class Uke1 {

    public static void main(String[] args) {
        int result = Uke1.sumOfEvenNumberUsingAlg(10);
        System.out.println("The sum of even numbers in the given interval is : "
                            + result);
        System.out.println(Uke1.sumOfEvenNumbers(0,10));
    }

    public static int sumOfEvenNumbers(int startNumber,int endNumber){
        int sumOfEvenNumber = 0;

        for(int i=startNumber;i<=endNumber;i++){
            if(i % 2 == 0){
                sumOfEvenNumber = sumOfEvenNumber + i;
            }
        }

        return sumOfEvenNumber;
    }

    public static int sumOfEvenNumberUsingAlg(int limit){
        int half = limit / 2;
        return half * (half + 1);
    }
}
