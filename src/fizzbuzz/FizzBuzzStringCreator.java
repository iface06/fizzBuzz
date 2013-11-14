package fizzbuzz;

import java.util.List;

public class FizzBuzzStringCreator {

    private String numberSeperator = " ";
    private String scoreSeperator = "";
    private String scoringString;

    public String create(List<Score> scoring) {
        scoringString = new String();
        for (Score scoreingForNumber : scoring) {
            appendScoringStringForNumber(scoreingForNumber);
        }
        return scoringString;
    }

    public void setSeperator(String seperator) {
        this.numberSeperator = seperator;
    }

    private void appendScoringStringForNumber(Score scoreingForNumber) {
        if (!scoreingForNumber.hasScoring()) {
            appendNumberIfTheirIsNoScoring(scoreingForNumber);
        } else {
            appendNumberSeperator();
            appendScoring(scoreingForNumber);
        }
    }

    private void appendNumberIfTheirIsNoScoring(Score scoreingForNumber) {
        if (!scoringString.isEmpty()) {
            scoringString += numberSeperator + scoreingForNumber.getNumber().toString();
        } else {
            scoringString += scoreingForNumber.getNumber().toString();
        }
    }

    private void appendNumberSeperator() {
        if (!scoringString.isEmpty()) {
            scoringString += numberSeperator;
        }
    }

    private void appendScoring(Score scoreingForNumber) {
        for (String score : scoreingForNumber.getScores()) {
            if (!scoringString.isEmpty()) {
                scoringString += scoreSeperator + score;
            } else {
                scoringString += score;
            }
        }
    }
}
