package fizzbuzz;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzPrinterTest {

    private List<String> sorcing;
    private FizzBuzzPrinter printer;

    @Test
    public void testPrintingOneNumber() {
        sorcing.add("1");
        String printout = printer.print(sorcing);

        assertEquals("1", printout);
    }

    @Test
    public void testPrintingTwoNumberWithSeperator() {
        sorcing.add("1");
        sorcing.add("2");
        printer.setSeperator(" ");
        String printout = printer.print(sorcing);
        assertEquals("1 2", printout);
    }

    @Before
    public void before() {
        printer = new FizzBuzzPrinter();
        sorcing = new ArrayList<String>();
    }
}
