
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class TicTest {

    Tic tic = new Tic();

    @Test
    public void testCreate() {
        String[][] result = {{"_","_","_","_","_"},{"_","_","_"}};
        assertTrue(Arrays.deepEquals(result,tic.create(5,8)));
    }

    @Test 
    public void testGetSize() {
        assertEquals(42, tic.getSize(7,6));
    }

    @Test 
    public void testBoard(){
        String[][] ans = {{"_","_"},{,"_","_"},{"_","_","_"}};
        assertTrue(Arrays.deepEquals(ans,tic.board()));
    }
}