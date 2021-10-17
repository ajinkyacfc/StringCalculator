package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    public void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("");
        assertEquals(0, result);
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1");
        assertEquals(1, result);
    }

    @Test
    void addTwoNumbers(){
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1,2");
        assertEquals(3,result);
    }


}
