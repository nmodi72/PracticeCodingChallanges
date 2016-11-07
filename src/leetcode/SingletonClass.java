package leetcode;

import java.util.Random;

/**
 * Singleton Class Demo
 */
public class SingletonClass {

    private static final SingletonClass instance = new SingletonClass();
    
    private static int var;
    
    private SingletonClass(){
        Random rand = new Random();
        this.var = rand.nextInt(50) + 1;
    }
    
    public static SingletonClass getInstance(){
        return instance;
    }
    
    public static int getRandomInt(){
        return var;
    }
}
