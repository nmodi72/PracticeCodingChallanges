package basic.java.practice;

public class RecursiveOperation {

    public int factorial(int n) throws InterruptedException{
        if(n == 0){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public int findMax(int[] array, int startIndex) {
        if(startIndex == array.length-1) {
            return array[startIndex];
        } else {
            int higestNumber = (array[startIndex] >= findMax(array, startIndex + 1)) ? array[startIndex] : findMax(array, startIndex + 1);
//            return higestNumber;
            return Math.max(array[startIndex], findMax(array, startIndex + 1));
        }
    }
}
