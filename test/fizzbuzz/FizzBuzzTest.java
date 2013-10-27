package fizzbuzz;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    private List<String> scoring;
    private FizzBuzz game;

    @Test
    public void testPlayWithZero() {
        scoring = game.play(0, 0);
        assertScoring(scoring, Arrays.asList("0"));
    }

    @Test
    public void testPlayWithOne() {
        scoring = game.play(1, 1);
        assertScoring(scoring, Arrays.asList("1"));
    }

    @Test
    public void testPlayWithTwoNumbers() {
        scoring = game.play(1, 2);
        assertScoring(scoring, Arrays.asList("1", "2"));
    }

    @Test
    public void testPlayWithFizz() {
        scoring = game.play(2, 3);
        assertScoring(scoring, Arrays.asList("2", "Fizz"));
    }

    @Test
    public void testPlayWithBuzz() {
        scoring = game.play(4, 5);
        assertScoring(scoring, Arrays.asList("4", "Buzz"));
    }

    @Test
    public void testPlayWithFizzBuzz() {
        scoring = game.play(14, 15);
        assertScoring(scoring, Arrays.asList("14", "FizzBuzz"));
    }

    @Test
    public void testPlayFromOneTwoTwenty() {
        scoring = game.play(1, 20);
        assertScoring(scoring, Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"));
    }

    @Test
    public void testPlayWithWrongOrder() {
        scoring = game.play(5, 1);
        assertScoring(scoring, new ArrayList<String>());
    }

    public void assertScoring(List<String> scoring, List<String> expectedScoring) {
        assertEquals(expectedScoring.size(), scoring.size());
        for (int i = 0; i < scoring.size(); i++) {
            assertEquals(expectedScoring.get(i), scoring.get(i));
        }
    }

    @Before
    public void before() {
        game = new FizzBuzz();

    }
}
