import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    private static String Lower = "abcdefghijklmnopqrstuvwxyz";
    private static String Upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String Digits = "0123456789";
    private static String Special = "!@#$%^&*()_+-=[]{}|:;'<>,.?";

    public static char[] Password(int chars){
        char[] newPassword = new char[chars];
        Random rando = new Random();
        String values = Lower + Upper + Digits + Special;
        for(int i = 0; i < chars; i++){
            newPassword[i] = values.charAt(rando.nextInt(values.length()));
        }
        return newPassword;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many passwords would you like?");
        int passwords = scan.nextInt();
        System.out.println("How many characters would you prefer?");
        int chars = scan.nextInt();
        for(int i = 0; i < passwords; i++){
            System.out.println(Password(chars));
        }

    }
}