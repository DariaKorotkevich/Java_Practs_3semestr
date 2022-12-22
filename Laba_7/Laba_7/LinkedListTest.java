package Laba_7;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> lyrics = new LinkedList<>();
        lyrics.add("Tell");
        lyrics.add("Me");
        lyrics.add("PLease");
        System.out.println(lyrics);
        lyrics.remove(2);
        lyrics.add("Why");
        lyrics.add("I");
        System.out.println(lyrics);
        lyrics.add(3, "We");
        lyrics.remove(4);
        System.out.println(lyrics);
    }
}