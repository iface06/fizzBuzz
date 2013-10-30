package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class NumberContainingRule implements GameRule {

    private final Integer scoreNumber;
    private final String score;
    private List<String> scoring;
    private List<Integer> digitsOfNumber;

    public NumberContainingRule(Integer scoreNumber, String score) {
        this.scoreNumber = scoreNumber;
        this.score = score;
    }

    @Override
    public List<String> apply(Integer number) {
        scoring = new ArrayList<>();
        splitDigitsOfNumber(number);
        collectScores(number);

        return scoring;
    }

    private void splitDigitsOfNumber(Integer number) {
        digitsOfNumber = new ArrayList<>();
        splitDecimalDigits(number);

    }

    private void splitDecimalDigits(Integer number) {
        if (number / 10 > 0) {
            splitDecimalDigits(number / 10);
        }
        digitsOfNumber.add(number % 10);
    }

    private void collectScores(Integer number) {
        int indexOfSearchedNumber = digitsOfNumber.indexOf(scoreNumber);
        if (indexOfSearchedNumber > -1) {
            scoring.add(score);
            digitsOfNumber.remove(indexOfSearchedNumber);
            collectScores(number);
        }
    }
}
