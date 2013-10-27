/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import java.util.*;

/**
 *
 * @author iface06
 */
public class FizzBuzz {

    private List<String> sequence = new ArrayList<>();

    public List<String> play(int startNumber, int endNumber) {
        if (startNumber <= endNumber) {
            playWithNumberRange(startNumber, endNumber);
        }
        return sequence;
    }

    private void playWithNumberRange(int start, int end) {
        for (int number = start; number <= end; number++) {
            sequence.add(playWithNumber(number));
        }

    }

    private String playWithNumber(int number) {
        String scoring = new String();
        boolean isGreaterZero = number > 0;
        boolean isDivisibleByThree = isGreaterZero && number % 3 == 0;
        boolean isDivisibleByFive = isGreaterZero && number % 5 == 0;
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
