package fizzbuzz;

import java.util.List;

/**
 *
 * @author Tobias
 */
public class FizzBuzzPrinter {

    private String seperator = " ";

    public String print(List<String> scoring) {
        String print = new String();
        for (String string : scoring) {
            if (!print.isEmpty()) {
                print += seperator += string;
            } else {
                print += string;
            }

        }
        return print;
    }

    public void setSeperator(String seperator) {
        this.seperator = seperator;
    }
}
