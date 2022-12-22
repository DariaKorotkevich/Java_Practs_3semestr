package mirea.laba1;

import java.lang.*;
public class TestFrisby {
    public static void main(String[] args) {
        Frisbi f0 = new Frisbi();
        Frisbi f1 = new Frisbi(2, 3, "Tarelka");
        Frisbi f2 = new Frisbi("neTarelka");
        Frisbi f3 = new Frisbi(5, 10);

        f3.setName("YesFrisby");
        f2.setDiametr2(4);
        System.out.println(f0);
        f0.FlightRange();
        System.out.println(f1);
        f1.FlightRange();
        System.out.println(f2);
        f2.FlightRange();
        System.out.println(f3);
        f3.FlightRange();
    }
}
