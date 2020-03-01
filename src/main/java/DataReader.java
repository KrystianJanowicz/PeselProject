package main.java;

import java.util.Scanner;

public class DataReader {
    String pesel, city, firstname, lastname;

    public String getPesel() {
        return pesel;
    }

    public void scanData() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pesel: ");
        pesel =scanner.nextLine();
        if(Pesel.isValid(pesel)==false){
                return;
        }
        System.out.print("Miasto: ");
        city =scanner.nextLine();
        System.out.print("Imie: ");
        firstname =scanner.nextLine();
        System.out.print("Nazwisko: ");
        lastname =scanner.nextLine();

        displayData();

    }

    public void displayData(){
        System.out.println("Jesteś " + firstname + " " + lastname + ", mieszkasz w " + city + ", a twój pesel to " + pesel);
    }
}
