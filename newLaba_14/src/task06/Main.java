package task06;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z]+");

        Matcher m = pattern.matcher(date);
        if(m.matches()){
            System.out.println(date + " является");
        }
        else {
            System.out.println(date + " не является");
        }
    }
}