package fizzbuzz;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberContainingRuleTest {

    private List<String> scoring;

    public NumberContainingRuleTest() {
    }

    @Test
    public void testSomeMethod() {
        NumberContainingRule rule = new NumberContainingRule(3, "Fizz");
        scoring = rule.apply(1);
        assertScoring(scoring, Collections.EMPTY_LIST);
    }

    @Test
    public void testContainsThree() {
        NumberContainingRule rule = new NumberContainingRule(3, "Fizz");
        scoring = rule.apply(3);
        assertScoring(scoring, Arrays.asList("Fizz"));
    }

    @Test
    public void testContainsToweTimesThree() {
        NumberContainingRule rule = new NumberContainingRule(3, "Fizz");
        scoring = rule.apply(33);
        assertScoring(scoring, Arrays.asList("Fizz", "Fizz"));
    }

    public void assertScoring(List<String> scoring, List<String> expectedScoring) {
        assertEquals(expectedScoring.size(), scoring.size());
        for (int i = 0; i < scoring.size(); i++) {
            assertEquals(expectedScoring.get(i), scoring.get(i));
        }
    }
}
