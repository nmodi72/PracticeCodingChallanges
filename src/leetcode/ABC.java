package leetcode;

public class ABC {

 
private static final String NO_TRANSACTIONS_ERR = "No transactions found.";
private static final String NO_POSITIVE_ERR = "No positive transactions found.";

/**
 * Complete this function.
 *
 * @param inputValues an array of double values.
 * @return "Average: XX.XX"
 */
 String getStatistics(Double[] inputValues) {
    if (inputValues == null) {
        return NO_TRANSACTIONS_ERR;
    }
    String average = "Average: ";
    Double averageValue = 0.00;
    Integer elementSize = 0;
    Double inputValue = 0.00;
    for(Double value : inputValues)
    {
        if (value >= 0) {
            inputValue = inputValue + value;
            elementSize = elementSize +1;
        } 
    }
    if (elementSize == 0) {
        return NO_POSITIVE_ERR;
    }
    averageValue = inputValue / elementSize;
    return average + decimalFormatter(averageValue);
}

/**
 * A helper method that returns a Double as a string in a 2 decimal format
 *
 * @param value the double value to format
 * @return the value as a String with a 2 decimal format
 */
private static String decimalFormatter(Double value) {
    return String.format("%.2f", value);
}
}
