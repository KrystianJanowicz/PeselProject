

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PeselTest extends Pesel {

    @Test
    public void testIsLenghtOk() {
        assertTrue(isLengthOk("11111111111"));
        assertFalse(isLengthOk("2222"));
    }


    @Test
    public void testCheckSum() {
        assertFalse(checkSum("11111111111"));
        assertTrue(checkSum("44051401359"));
    }

}
