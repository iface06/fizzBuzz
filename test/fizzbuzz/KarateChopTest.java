package fizzbuzz;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class KarateChopTest {

    @Test
    public void testChop() {
        assertEquals(-1, chop(3, new ArrayList<Integer>()));
        assertEquals(0, chop(1, Arrays.asList(1)));
        assertEquals(3, chop(5, Arrays.asList(1, 2, 3, 5)));
    }

    public int chop(int searchTarget, List<Integer> integers) {
        int index = integers.indexOf(searchTarget);
        return index;
    }
}
