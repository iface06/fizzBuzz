package fizzbuzz;

import java.util.*;

public class FizzBuzzWoofGame {

    private List<Score> scores = new ArrayList<>();;
    private List<GameRule> rules = new LinkedList<>();

    public List<Score> play(int startNumber, int endNumber) {
        for (int number = startNumber; number <= endNumber; number++) {
            Score scoreForNumber = playWithNumber(number);
            scores.add(scoreForNumber);
        }

        return scores;
    }

    public void addRule(GameRule rule) {
        rules.add(rule);
    }

    private Score playWithNumber(int number) {
        Score scoreForNumber = new Score(number);
        for (GameRule gameRule : rules) {
            List<String> scoresForNumber = gameRule.apply(number);
            scoreForNumber.addScores(scoresForNumber);
        }
        return scoreForNumber;
    }
}
