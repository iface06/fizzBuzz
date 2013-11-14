package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Score {

    private Integer number;
    private List<String> scores = new ArrayList<>();

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
