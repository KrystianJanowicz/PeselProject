

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class DataWriterTest extends DataWriter {

    @Test
    public void makeFileTest() throws FileNotFoundException, UnsupportedEncodingException {
        Person person = new Person();
        assertEquals("Jesteś name lastname, mieszkasz w city, a twój pesel to 44051401359", makeFile(person));
    }


}
