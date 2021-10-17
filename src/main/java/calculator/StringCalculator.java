package calculator;

import java.util.ArrayList;
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
        List<String> negatives = new ArrayList<>();
        for (String numb:output) {
            if (Integer.parseInt(numb) < 0)
                negatives.add(numb);
            result+=Integer.parseInt(numb);
        }
        if (negatives.isEmpty())
            return result;
        String message = "Negatives: ";
        for (String negative: negatives) {
            message += negative + " ";
        }
        throw new NegativeNumberException(message.trim());
    }




}