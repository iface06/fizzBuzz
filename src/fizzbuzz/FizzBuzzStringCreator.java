package fizzbuzz;

import java.util.List;

public class FizzBuzzStringCreator {

    private String numberSeperator = " ";
    private String scoreSeperator = "";
    private String scoringString;

    public String create(List<Scoring> scoring) {
        scoringString = new String();
        for (Scoring scoreingForNumber : scoring) {
            appendScoringStringForNumber(scoreingForNumber);
        }
        return scoringString;
    }

    public void setSeperator(String seperator) {
        this.numberSeperator = seperator;
    }

    private void appendScoringStringForNumber(Scoring scoreingForNumber) {
        if (!scoreingForNumber.hasScoring()) {
            appendNumberIfTheirIsNoScoring(scoreingForNumber);
        } else {
            appendNumberSeperator();
            appendScoring(scoreingForNumber);
        }
    }

    private void appendNumberIfTheirIsNoScoring(Scoring scoreingForNumber) {
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

    private void appendScoring(Scoring scoreingForNumber) {
        for (String score : scoreingForNumber.getScores()) {
            if (!scoringString.isEmpty()) {
                scoringString += scoreSeperator + score;
            } else {
                scoringString += score;
            }
        }
    }
}
