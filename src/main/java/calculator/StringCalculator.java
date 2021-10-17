package calculator;

import java.util.List;

public class StringCalculator {

    public int add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }

        if (numbers.matches("[0-9]")){
            return Integer.parseInt(numbers);
        }

        String[] output = numbers.split("\\,");

        return Integer.parseInt(output[0]) + Integer.parseInt(output[1]);
    }

}