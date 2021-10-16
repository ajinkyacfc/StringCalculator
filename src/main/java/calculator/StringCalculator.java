package calculator;

public class StringCalculator {

    public int add(String numbers) {
        if ("".equalsIgnoreCase(numbers))
            return 0;
        return Integer.valueOf(numbers);
    }

}