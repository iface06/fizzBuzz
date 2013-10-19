package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testPlayFizzBuzz() {
        assertEquals("0", play(0, 0));
        assertEquals("0", play(5, 1));
        assertEquals("1", play(1, 1));
        assertEquals("1 2", play(1, 2));
        assertEquals("2 Fizz", play(2, 3));
        assertEquals("4 Buzz", play(4, 5));
        assertEquals("14 FizzBuzz", play(14, 15));
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz", play(1, 20));
    }

    private String play(int startNumber, int endNumber) {
        if (startNumber > 0 && endNumber > 0 && startNumber <= endNumber) {
            return playWithNumberRange(startNumber, endNumber);
        } else {
            return String.valueOf(0);
        }
    }

    private String playWithNumberRange(int start, int end) {
        String sequence = new String();
        for (int number = start; number <= end; number++) {
            sequence += getWhitespaceIfNotEmpty(sequence);
            sequence += playWithNumber(number);
        }
        return sequence;
    }

    private String getWhitespaceIfNotEmpty(String sequence) {
        if (!sequence.isEmpty()) {
            return " ";
        }
        return "";
    }

    private String playWithNumber(int number) {
        String scoring = new String();
        boolean isDivisibleByThree = number % 3 == 0;
        boolean isDivisibleByFive = number % 5 == 0;
        if (isDivisibleByThree) {
            scoring += "Fizz";
        }
        if (isDivisibleByFive) {
            scoring += "Buzz";
        }
        if (!(isDivisibleByThree || isDivisibleByFive)) {
            scoring += String.valueOf(number);
        }
        return scoring;
    }
}
