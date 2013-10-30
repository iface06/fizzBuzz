package fizzbuzz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DivisibleRule implements GameRule {

    private final int divisor;
    private final String scoring;

    public DivisibleRule(int divisor, String scoring) {

        this.divisor = divisor;
        this.scoring = scoring;
    }

    @Override
    public List<String> apply(Integer number) {
        if (number > 0 && number % divisor == 0) {
            return Arrays.asList(scoring);
        } else {
            return Collections.EMPTY_LIST;
        }
    }
}
