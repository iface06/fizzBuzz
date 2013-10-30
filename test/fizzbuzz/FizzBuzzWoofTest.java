package fizzbuzz;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzWoofTest {

    private FizzBuzzWoofGame game;

    @Test
    public void testSomeMethod() {
        List<Scoring> scorings = game.play(1, 1);
        assertGameScoring(scorings, Arrays.asList(scoring(1)));
    }

    @Test
    public void testAddRulesToGame() {
        GameRule rule = new GetWhatYouGiveRule();
        game.addRule(rule);

        List<Scoring> scorings = game.play(1, 1);

        assertGameScoring(scorings, Arrays.asList(scoring(1, "1")));
    }

    @Test
    public void testAddTwoRulesToGame() {
        GameRule rule1 = new GetWhatYouGiveRule();
        GameRule rule2 = new GetWhatYouGiveRule();
        game.addRule(rule1);
        game.addRule(rule2);

        List<Scoring> scorings = game.play(1, 1);

        assertGameScoring(scorings, Arrays.asList(scoring(1, "1", "1")));
    }

    @Test
    public void testAddTwoRulesAndTwoNumbersToGame() {
        GameRule rule1 = new GetWhatYouGiveRule();
        GameRule rule2 = new GetWhatYouGiveRule();
        game.addRule(rule1);
        game.addRule(rule2);

        List<Scoring> scorings = game.play(1, 2);

        assertGameScoring(scorings, Arrays.asList(scoring(1, "1", "1"), scoring(2, "2", "2")));
    }

    private Scoring scoring(Integer number, String... scores) {
        Scoring scoring = new Scoring();
        scoring.setNumber(number);
        scoring.addScores(Arrays.asList(scores));
        return scoring;
    }

    private void assertGameScoring(List<Scoring> scorings, List<Scoring> expectedScorings) {
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
