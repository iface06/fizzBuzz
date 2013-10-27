package fizzbuzz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivisibleRuleTest {

    private List<String> scoring;

    @Test
    public void testNoScoring() {
        DivisibleRule rule = new DivisibleRule(3, "Fizz");
        scoring = rule.apply(1);

        assertScoring(scoring, Collections.EMPTY_LIST);
    }

    @Test
    public void testFizzScoring() {
        DivisibleRule rule = new DivisibleRule(3, "Fizz");
        scoring = rule.apply(3);

        assertScoring(scoring, Arrays.asList("Fizz"));
    }

    @Test
    public void testBuzzScoring() {
        DivisibleRule rule = new DivisibleRule(5, "Buzz");
        scoring = rule.apply(5);

        assertScoring(scoring, Arrays.asList("Buzz"));
    }

    @Test
    public void testWoofScoring() {
        DivisibleRule rule = new DivisibleRule(7, "Woof");
        scoring = rule.apply(7);

        assertScoring(scoring, Arrays.asList("Woof"));
    }

    public void assertScoring(List<String> scoring, List<String> expectedScoring) {
        assertEquals(expectedScoring.size(), scoring.size());
        for (int i = 0; i < scoring.size(); i++) {
            assertEquals(expectedScoring.get(i), scoring.get(i));
        }
    }
}
