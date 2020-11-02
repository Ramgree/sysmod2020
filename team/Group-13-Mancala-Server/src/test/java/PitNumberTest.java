import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

import static spark.Spark.*;

public class PitNumberTest {
    @Test
    public void testOppositePits() {
        assert(WebConnect.getOppositePitId(0) == 11);
        assert(WebConnect.getOppositePitId(1) == 10);
        assert(WebConnect.getOppositePitId(2) == 9);
        assert(WebConnect.getOppositePitId(3) == 8);
        assert(WebConnect.getOppositePitId(4) == 7);
        assert(WebConnect.getOppositePitId(5) == 6);
        assert(WebConnect.getOppositePitId(6) == 5);
        assert(WebConnect.getOppositePitId(7) == 4);
        assert(WebConnect.getOppositePitId(8) == 3);
        assert(WebConnect.getOppositePitId(9) == 2);
        assert(WebConnect.getOppositePitId(10) == 1);
        assert(WebConnect.getOppositePitId(11) == 0);
    }

}
