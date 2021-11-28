//factorial
//power
//minimum
//linear search
//sum of array

public class RecursiveProblems {
    private static final int factorialOfZero = 1;

    public int factorialOf(int limit){
        if(limit == 0){
            return factorialOfZero;
        }
        return limit * factorialOf(limit - 1);
    }

    public int powerOf(int base, int over){
        if(over == 0){
            return 1;
        }
        return  1;
    }


    public int findSum(int[] a, int n) {
        if (n == 0)
            return 0;
        return (findSum(a, n - 1) + a[n - 1]);
    }

    public int maxOfArray(int[] numbers,int index){
        if(index > 0) {
            return Math.max(numbers[index], maxOfArray(numbers, index - 1));
        }else{
            return numbers[0];
        }
    }

    public int maxOfArrayMethodTwo(int[] numbers,int index){
        if(index == 0)
            return numbers[0];
        return Math.max(numbers[index], maxOfArray(numbers, index - 1));
    }


    public static void main(String[] args) {
        RecursiveProblems problems = new RecursiveProblems();

        System.out.println(problems.maxOfArrayMethodTwo(new int[]{9,2,7,123},3));
    }
}
