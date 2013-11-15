package fizzbuzz;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzWoofTest {

    private FizzBuzzWoofGame game;

    @Test
    public void testSomeMethod() {
        List<Score> scorings = game.play(1, 1);
        assertGameScoring(scorings, Arrays.asList(scoring(1)));
    }

    @Test
    public void testAddRulesToGame() {
        GameRule rule = new GetWhatYouGiveRule();
        game.addRule(rule);

        List<Score> scorings = game.play(1, 1);

        assertGameScoring(scorings, Arrays.asList(scoring(1, "1")));
    }

    @Test
    public void testAddTwoRulesToGame() {
        GameRule rule1 = new GetWhatYouGiveRule();
        GameRule rule2 = new GetWhatYouGiveRule();
        game.addRule(rule1);
        game.addRule(rule2);

        List<Score> scorings = game.play(1, 1);

        assertGameScoring(scorings, Arrays.asList(scoring(1, "1", "1")));
    }

    @Test
    public void testAddTwoRulesAndTwoNumbersToGame() {
        GameRule rule1 = new GetWhatYouGiveRule();
        GameRule rule2 = new GetWhatYouGiveRule();
        game.addRule(rule1);
        game.addRule(rule2);

        List<Score> scorings = game.play(1, 2);

        assertGameScoring(scorings, Arrays.asList(scoring(1, "1", "1"), scoring(2, "2", "2")));
    }

    private Score scoring(Integer number, String... scores) {
        Score scoring = new Score(number);
        scoring.addScores(Arrays.asList(scores));
        return scoring;
    }

    private void assertGameScoring(List<Score> scorings, List<Score> expectedScorings) {
        assertEquals(expectedScorings.size(), scorings.size());
        for (int i = 0; i < scorings.size(); i++) {
            assertEquals(expectedScorings.get(i).getNumber(), scorings.get(i).getNumber());
            assertEquals(expectedScorings.get(i).getScores().size(), scorings.get(i).getScores().size());
        }
    }

    @Before
    public void before() {
        game = new FizzBuzzWoofGame();
    }

    static class GetWhatYouGiveRule implements GameRule {

        @Override
        public List<String> apply(Integer number) {
            return Arrays.asList(number.toString());
        }
    }
}
