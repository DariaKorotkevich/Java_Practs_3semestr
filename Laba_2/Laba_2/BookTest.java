package Laba_2;

import Laba_2.Book;

public class BookTest {
    public static void main(String[] arg){
        Book a1=new Book("Name","Author","23/12/2018");

        System.out.println(a1);
        a1.setAuthor("Li Bardugo");
        a1.setName("Six Raven");
        System.out.println(a1);
    }
}
