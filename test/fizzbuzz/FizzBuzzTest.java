package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testPlayFizzBuzz() {
        assertEquals("0", play(0, 0));
        assertEquals("1", play(1, 1));
        assertEquals("1 2", play(1, 2));
        assertEquals("2 Fizz", play(2, 3));
        assertEquals("4 Buzz", play(4, 5));
        assertEquals("14 FizzBuzz", play(14, 15));
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz", play(1, 20));
    }

    private String play(int start, int end) {
        if (start > 0 && end > 0) {
            String sequence = new String();
            for (; start <= end; start++) {
                sequence = calculateSequence(sequence, start);
            }
            return sequence;
        } else {
            return String.valueOf(0);
        }
    }

    private String calculateSequence(String sequence, int number) {
        sequence = appendWhiteSpaceIfEmpty(sequence);
        boolean isDivisibleByThree = number % 3 == 0;
        boolean isDivisibleByFive = number % 5 == 0;
        if (isDivisibleByThree) {
            sequence += "Fizz";
        }
        if (isDivisibleByFive) {
            sequence += "Buzz";
        }
        if (!(isDivisibleByThree || isDivisibleByFive)) {
            sequence += String.valueOf(number);
        }
        return sequence;
    }

    private String appendWhiteSpaceIfEmpty(String sequence) {
        if (!sequence.isEmpty()) {
            sequence += " ";
        }
        return sequence;
    }
}
