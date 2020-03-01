package main.java;

public class Main {

    public static void main(String[] args) {

        Pesel pesel = new Pesel();

        main.java.DataReader reader = new main.java.DataReader();
        reader.scanData();
        System.out.println(pesel.getPesel());
    }
}
