package fizzbuzz;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzStringCreatorTest {

    private List<Scoring> scoring;
    private FizzBuzzStringCreator printer;

    @Test
    public void testPrintingOneNumber() {
        scoring.add(scoring(1));
        String printout = printer.create(scoring);

        assertEquals("1", printout);
    }

    @Test
    public void testPrintingTwoNumberWithSeperator() {
        scoring.add(scoring(1));
        scoring.add(scoring(2));
        String printout = printer.create(scoring);
        assertEquals("1 2", printout);
    }

    @Test
    public void testPrintingTwoNumberWithHyphenSeperator() {
        scoring.add(scoring(1));
        scoring.add(scoring(2));
        printer.setSeperator("-");
        String printout = printer.create(scoring);
        assertEquals("1-2", printout);
    }

    @Test
    public void testPrintingThreeNumberAndScoringForThree() {
        scoring.add(scoring(1));
        scoring.add(scoring(2));
        scoring.add(scoring(3, "Fizz", "Fizz"));
        printer.setSeperator(" - ");
        String printout = printer.create(scoring);
        assertEquals("1 - 2 - FizzFizz", printout);
    }

    @Test
    public void testPrintingThreeFizz() {
        scoring.add(scoring(33, "Fizz", "Fizz", "Fizz"));
        printer.setSeperator(" ");
        String printout = printer.create(scoring);
        assertEquals("FizzFizzFizz", printout);
    }

    @Before
    public void before() {
        printer = new FizzBuzzStringCreator();
        scoring = new ArrayList<Scoring>();
    }

    private Scoring scoring(Integer number, String... scores) {
        Scoring scoring = new Scoring();
        scoring.setNumber(number);
        scoring.addScores(Arrays.asList(scores));
        return scoring;
    }
}
