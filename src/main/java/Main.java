import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        Person person = new Person();
        person.scanData();
        DataWriter writer = new DataWriter();
        writer.makeFile(person);

    }
}
