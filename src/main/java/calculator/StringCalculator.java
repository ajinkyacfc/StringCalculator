package calculator;

import java.util.List;

public class StringCalculator {

    public int add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }

      /*  if (numbers.matches("[0-9]")){
            return Integer.parseInt(numbers);
        }

       */
        String[] output = numbers.split(",|\n");

        int result = 0;
        for (String numb:output) {
            if (Integer.parseInt(numb) < 0)
                throw new NegativeNumberException();
            result+=Integer.parseInt(numb);
        }
        return result;
    }

    private String getDelimetersPattern(String numbers){
        if (numbers.startsWith("//")){
            return String.valueOf(numbers.charAt(2));
        }
        return ",";
    }

}