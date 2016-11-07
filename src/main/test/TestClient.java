package main.test;

import basic.java.practice.RecursiveOperation;

public class TestClient {

    public static void main(String[] args) throws InterruptedException {
        RecursiveOperation recursionExample = new RecursiveOperation();
        int[] array = {23, 4, 6, 76, 23, 122, 55, 2^5, 4*4, -6, 87};
        
        
        long startTime = System.nanoTime();
        System.out.println("Answer is" + recursionExample.findMax(array, 0));
        long endTime = System.nanoTime();
        System.out.println("Time taken by recusion: " + (endTime - startTime) / 1000);

//        
//        RecursiveOperation recursionExample = new RecursiveOperation();
//        long startTime = System.nanoTime();
//        System.out.println("Answer is" + recursionExample.factorial(30));
//        long endTime = System.nanoTime();
//        System.out.println("Time taken by recusion: " + (endTime - startTime) / 1000);
//
//        RecursiveOperation recursionExample1 = new RecursiveOperation();
//        long startTime1 = System.nanoTime();
//        System.out.println("Answer is" + recursionExample1.factorial(30));
//        long endTime1 = System.nanoTime();
//        System.out.println("Time taken by recusion: " + (endTime1 - startTime1) / 1000);
//
//        RecursiveOperation recursionExample2 = new RecursiveOperation();
//        long startTime2 = System.nanoTime();
//        System.out.println("Answer is" + recursionExample2.factorial(30));
//        long endTime2 = System.nanoTime();
//        System.out.println("Time taken by recusion: " + (endTime2 - startTime2) / 1000);
//
//        RecursiveOperation recursionExample3 = new RecursiveOperation();
//        long startTime3 = System.nanoTime();
//        System.out.println("Answer is" + recursionExample3.factorial(30));
//        long endTime3 = System.nanoTime();
//        System.out.println("Time taken by recusion: " + (endTime3 - startTime3) / 1000);
//
//        RecursiveOperation recursionExample4 = new RecursiveOperation();
//        long startTime4 = System.nanoTime();
//        System.out.println("Answer is" + recursionExample4.factorial(30));
//        long endTime4 = System.nanoTime();
//        System.out.println("Time taken by recusion: " + (endTime4 - startTime4) / 1000);
//
//        RecursiveOperation recursionExample5 = new RecursiveOperation();
//        long startTime5 = System.nanoTime();
//        System.out.println("Answer is" + recursionExample5.factorial(30));
//        long endTime5 = System.nanoTime();
//        System.out.println("Time taken by recusion: " + (endTime5 - startTime5) / 1000);

    }

}
