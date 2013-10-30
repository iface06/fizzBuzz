package fizzbuzz;

import java.util.*;

public class FizzBuzzWoofGame {

    private List<Scoring> scoring;
    private List<GameRule> rules = new LinkedList<>();
    private Scoring scoringForNumber;

    public List<Scoring> play(int startNumber, int endNumber) {
        scoring = new ArrayList<>();
        for (int number = startNumber; number <= endNumber; number++) {
            createScoringForCurrentNumber(number);
            playWithNumber(number);
            scoring.add(scoringForNumber);
        }

        return scoring;
    }

    public void addRule(GameRule rule) {
        rules.add(rule);
    }

    private Scoring createScoringForCurrentNumber(int number) {
        scoringForNumber = new Scoring();
        scoringForNumber.setNumber(number);
        return scoringForNumber;
    }

    private void playWithNumber(int number) {
        for (GameRule gameRule : rules) {
            List<String> scoresForNumber = gameRule.apply(number);
            scoringForNumber.addScores(scoresForNumber);
        }
    }
}
