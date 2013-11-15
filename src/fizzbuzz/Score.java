package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Score {

    private Integer number;
    private List<String> scores = new ArrayList<>();

    public Score(int number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public List<String> getScores() {
        return scores;
    }

    void addScores(List<String> scoresForNumber) {
        this.scores.addAll(scoresForNumber);
    }

    boolean hasScoring() {
        return !getScores().isEmpty();
    }
}
