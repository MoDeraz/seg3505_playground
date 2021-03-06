import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest {

    private int year;
    private int month;
    private int day;

    public DateNextDateExceptionTest(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

    }

    @Parameters
    public static List<Integer[]> data() {
        List<Integer[]> params = new LinkedList<Integer[]>();
        params.add(new Integer[] { 2002, 12, 1 });
        params.add(new Integer[] { 2993, 3, 9 });
        params.add(new Integer[] { -93, 1, 32 });
        return params;
    }

    @Test
    public void testNextDateException() {
        Assert.assertThrows(IllegalArgumentException.class, () -> new Date(year, month, day));

    }

}