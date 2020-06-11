import java.util.Scanner;

public class Person {
    String pesel, city, firstname, lastname;

    public Person() {
        this.pesel = "44051401359";
        this.city = "city";
        this.firstname = "name";
        this.lastname = "lastname";
    }

    public String getCity() {
        return city;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPesel() {
        return pesel;
    }

    public void scanData(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Miasto: ");
        city =scanner.nextLine();
        System.out.print("Imie: ");
        firstname =scanner.nextLine();
        System.out.print("Nazwisko: ");
        lastname =scanner.nextLine();
        System.out.print("Podaj pesel: ");
        pesel =scanner.nextLine();
        if(!Pesel.isValid(pesel)){
            return;
        }

    }

}
