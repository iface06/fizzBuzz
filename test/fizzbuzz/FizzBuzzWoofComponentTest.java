package fizzbuzz;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzWoofComponentTest {

    @Test
    public void testNoRuleEffective() {
        FizzBuzzWoofGame game = initGame();
        List<Scoring> scoring = game.play(1, 2);

        assertGameScoring(scoring, Arrays.asList(scoring(1), scoring(2)));
    }

    @Test
    public void testFizzFizz() {
        FizzBuzzWoofGame game = initGame();
        List<Scoring> scoring = game.play(2, 3);

        assertGameScoring(scoring, Arrays.asList(scoring(2), scoring(3, "Fizz", "Fizz")));
    }

    @Test
    public void testBuzzBuzz() {
        FizzBuzzWoofGame game = initGame();
        List<Scoring> scoring = game.play(4, 5);

        assertGameScoring(scoring, Arrays.asList(scoring(4), scoring(5, "Buzz", "Buzz")));
    }

    @Test
    public void testFizzWoofWoof() {
        FizzBuzzWoofGame game = initGame();
        List<Scoring> scoring = game.play(6, 7);

        assertGameScoring(scoring, Arrays.asList(scoring(6, "Fizz"), scoring(7, "Woof", "Woof")));
    }

    @Test
    public void testFizzBuzzBuzz() {
        FizzBuzzWoofGame game = initGame();
        List<Scoring> scoring = game.play(14, 15);

        assertGameScoring(scoring, Arrays.asList(scoring(14, "Woof"), scoring(15, "Fizz", "Buzz", "Buzz")));
    }

    @Test
    public void testFizzFizzFizzFizz() {
        FizzBuzzWoofGame game = initGame();
        List<Scoring> scoring = game.play(33, 34);

        assertGameScoring(scoring, Arrays.asList(scoring(33, "Fizz", "Fizz", "Fizz"), scoring(34, "Fizz")));
    }

    private void assertGameScoring(List<Scoring> scorings, List<Scoring> expectedScorings) {
        assertEquals(expectedScorings.size(), scorings.size());
        for (int i = 0; i < scorings.size(); i++) {
            assertEquals(expectedScorings.get(i).getNumber(), scorings.get(i).getNumber());
            assertScores(expectedScorings.get(i).getScores(), scorings.get(i).getScores());
        }
    }

    private void assertScores(List<String> expectedScores, List<String> scores) {
        assertEquals(expectedScores.size(), scores.size());
        for (int i = 0; i < scores.size(); i++) {
            assertEquals(expectedScores.get(i), scores.get(i));
        }
    }

    private Scoring scoring(Integer number, String... scores) {
        Scoring scoring = new Scoring();
        scoring.setNumber(number);
        scoring.addScores(Arrays.asList(scores));
        return scoring;
    }

    private FizzBuzzWoofGame initGame() {
        FizzBuzzWoofGame game = new FizzBuzzWoofGame();
        game.addRule(new NumberContainingRule(3, "Fizz"));
        game.addRule(new DivisibleRule(3, "Fizz"));
        game.addRule(new NumberContainingRule(5, "Buzz"));
        game.addRule(new DivisibleRule(5, "Buzz"));
        game.addRule(new NumberContainingRule(7, "Woof"));
        game.addRule(new DivisibleRule(7, "Woof"));
        return game;
    }
}
