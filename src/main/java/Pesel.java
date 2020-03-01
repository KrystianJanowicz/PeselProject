package main.java;


public class Pesel {

    String pesel;

    public String getPesel() {
            return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public static boolean isValid(String pesel){
        if(isLengthOk(pesel) && checkSum(pesel)){
            return true;
        }
        return false;
    }

    public static boolean isLengthOk(String pesel) {
        if (pesel.length() != 11) {
            System.out.println("Podany pesel nie ma 11 znaków");
            return false;
        } else {
            return true;
        }
    }

    static int[] peselConvert(String s) {

        int[] intArray = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Character.digit(s.charAt(i), 10);
        }
        return intArray;
    }

    public static boolean checkSum(String pesel){
        int PESEL[] = peselConvert(pesel);
        int sum = 9 * PESEL[0] +
                7 * PESEL[1] +
                3 * PESEL[2] +
                1 * PESEL[3] +
                9 * PESEL[4] +
                7 * PESEL[5] +
                3 * PESEL[6] +
                1 * PESEL[7] +
                9 * PESEL[8] +
                7 * PESEL[9];

        sum %= 10;

        if (sum == PESEL[10]) {
            return true;
        }
        else {
            System.out.println("Podany pesel nie jest prawidłowy (suma kontrolna)");
            return false;
        }
    }


}
