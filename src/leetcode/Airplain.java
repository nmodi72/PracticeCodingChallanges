package leetcode;

import java.util.Stack;

public class Airplain {
    public static void main(String[] args) {
        System.out.println(getPosition("4D2RXX"));
    }
    public static String getPosition(String command) {
        final String DEFAULT_COMMAND = "(999,999)";
        final int DEFAULT_MOVE = 1;
        Stack<Position> com = new Stack<Position>();
        int x = 0;
        int y = 0;
        int move = DEFAULT_MOVE; // this is to calculate moves to any direction.
        boolean multiplier = false;
        for (Character c : command.toCharArray()) {
            if (c >= '1' && c <= '9') {
                int numValue = Character.getNumericValue(c);
                if (multiplier) { // if numeric value is more than 10.
                    move = move * 10 + numValue;
                } else {
                    multiplier = true; // this will indicate that we already got numeric value.
                    move = numValue;
                }
            } else {
                switch (c) { // if you find any direction push it to the stack
                    case 'U' :
                        com.push(new Position(x, y + move));
                        break;
                    case 'D' :
                        com.push(new Position(x, y - move));
                        break;
                    case 'L' :
                        com.push(new Position(x - move, y));
                        break;
                    case 'R' :
                        com.push(new Position(x + move, y));
                        break;
                    case 'X' :
                        com.pop(); // if you find X delete the last command.
                        break;
                    default:
                        return DEFAULT_COMMAND;
                }
                move = DEFAULT_MOVE;
                multiplier =false;   // Set everything to default
            }
        }
        // Calculate new Position
        while (!com.isEmpty()) {
            Position p = com.pop();
            x = x + p.x;
            y = y + p.y;
        }
        return "(" + x + "," + y + ")";
    }
    static class Position {
        public int x;
        public int y;
        public Position(int x, int y) {
            this.x= x;
            this.y = y;
        }
    }

}
