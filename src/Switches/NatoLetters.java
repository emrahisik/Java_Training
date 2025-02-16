package Switches;

public class NatoLetters {
    public static String createNatoText(char letter){
        switch (letter){
            case 'A':
                return "A is for Able";
            case 'B':
                return "B is for Baker";
            case 'C':
                return "C is for Charlie";
            case 'D':
                return "D is for Dog";
            case 'E':
                return "E is for Easy";
            default:
                return "The letter " + letter + " is not found!";
        }
    }
    public static void main(String[] args) {
        System.out.println(createNatoText('D'));
        System.out.println(createNatoText('R'));
    }
}
