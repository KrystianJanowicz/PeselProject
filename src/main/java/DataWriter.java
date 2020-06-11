import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DataWriter {

    public String makeFile(Person prs) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(prs.getPesel()+".txt", "UTF-8");
        writer.println("IMIE: " + prs.getFirstname());
        writer.println("NAZWISKO: " + prs.getLastname());
        writer.println("MIASTO: " + prs.getCity());
        writer.println("PESEL: " + prs.getPesel());
        writer.close();
        return "Jesteś " + prs.getFirstname() + " " + prs.getLastname() + ", mieszkasz w " + prs.getCity() + ", a twój pesel to " + prs.getPesel();

    }
}
