package leetcode;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;

public class MainClass{

    public static void main(String[] args) throws UnknownHostException {
//        ExecutorService executor = Executors.newFixedThreadPool(10);
//        List<Future<String>> list = new ArrayList<Future<String>>();
//        Callable<String> callable = new JavaFuture();
//        for (int i = 0; i < 100; i++) {
//            Future<String> future = executor.submit(callable);
//            list.add(future);
//        }
//        
//        for (Future<String> future : list) {
//            try {
//                System.out.println(new Date()+ "::"+future.get());
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//        }
//        executor.shutdown();
//        System.out.println(getOverrideString().toLowerCase());
//        String a = new String("Nirav").intern();
//        String b = "Nirav";
//        System.out.println(a == b);
//        Airplain airplane = new Airplain();
//        System.out.println(airplane.getPosition("55"));
        
//        System.out.println(SingletonClass.getInstance().getRandomInt());
//        System.out.println(SingletonClass.getInstance().getRandomInt());
//        int var = 1;
//        try {
//            var = var /0;
//        } catch (ArithmeticException e) {
//            StringWriter stringWriter = new StringWriter();
//            PrintWriter printWriter = new PrintWriter(stringWriter);
//            e.printStackTrace(printWriter);
//            
//            System.out.println(" The Exception is : " + stringWriter.toString());
////            e.printStackTrace();
////        }
       String hostName = Inet4Address.getLocalHost().getHostName();
       System.out.println(hostName);
    }
    
 static String movePlane(String command) {
        
        String defaultOutputForInvalidInput = "(999, 999)";
        
        if(!(command.trim().isEmpty())) {
            int xPosition, yPosition;
            
            int unit = 1;
            int number = Integer.MIN_VALUE;
            ArrayList<Integer> xPositionForEachMove = new ArrayList<>();
            ArrayList<Integer> yPositionForEachMove = new ArrayList<>();
            char[] array = command.toCharArray();
            
            // check all the characters.
            for(char character : array) {
                // base case, when valid moves passed initialize the initial position
                if(xPositionForEachMove.isEmpty() && yPositionForEachMove.isEmpty()) {
                    xPositionForEachMove.add(0);
                    yPositionForEachMove.add(0);
                }
                if(Character.isDigit(character)) {
                    if(number != Integer.MIN_VALUE) {
                        // if previous character was already number
                        number = Integer.parseInt(String.valueOf(character)) + (10 * number);
                    } else {
                        number = Integer.parseInt(String.valueOf(character));
                    }
                } else {
                    unit = number != Integer.MIN_VALUE ? number : 1;
                    switch(character) {
                        case 'U':
                            xPosition = xPositionForEachMove.get(xPositionForEachMove.size() - 1);
                            yPosition = yPositionForEachMove.get(yPositionForEachMove.size() -1) + unit;
                            xPositionForEachMove.add(xPosition);
                            yPositionForEachMove.add(yPosition);
                            number = Integer.MIN_VALUE;
                            break;
                        case 'D':
                            xPosition = xPositionForEachMove.get(xPositionForEachMove.size() - 1);
                            yPosition = yPositionForEachMove.get(yPositionForEachMove.size() -1) - unit;
                            xPositionForEachMove.add(xPosition);
                            yPositionForEachMove.add(yPosition);
                            number = Integer.MIN_VALUE;
                            break;
                        case 'L':
                            xPosition = xPositionForEachMove.get(xPositionForEachMove.size() - 1) - unit;
                            yPosition = yPositionForEachMove.get(yPositionForEachMove.size() -1);
                            xPositionForEachMove.add(xPosition);
                            yPositionForEachMove.add(yPosition);
                            number = Integer.MIN_VALUE;
                            break;
                        case 'R':
                            xPosition = xPositionForEachMove.get(xPositionForEachMove.size() - 1) + unit;
                            yPosition = yPositionForEachMove.get(yPositionForEachMove.size() -1);
                            xPositionForEachMove.add(xPosition);
                            yPositionForEachMove.add(yPosition);
                            number = Integer.MIN_VALUE;
                            break;
                        case 'X':
                            if(xPositionForEachMove.size() > 1 && yPositionForEachMove.size() > 1) {
                                xPositionForEachMove.remove(xPositionForEachMove.size() - 1);
                                yPositionForEachMove.remove(yPositionForEachMove.size() - 1);
                            } 
                            number = Integer.MIN_VALUE;
                            break;
                        default:
                            return defaultOutputForInvalidInput;
                    }
                }
            }
            if(!(xPositionForEachMove.isEmpty()) && !(yPositionForEachMove.isEmpty())) {
                return "(" + xPositionForEachMove.get(xPositionForEachMove.size() - 1) + 
                        ", " + yPositionForEachMove.get(yPositionForEachMove.size() -1) +")";
            }
        }
        return defaultOutputForInvalidInput;
    }
}
