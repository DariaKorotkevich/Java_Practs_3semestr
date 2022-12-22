package mirea.laba1;

import java.lang.*;
public class Test {
    public static void main(String[] args) {
        Chip d1 = new Chip("Mike", 2);
        Chip d2 = new Chip("Helen", 7);
        Chip d3 = new Chip("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
