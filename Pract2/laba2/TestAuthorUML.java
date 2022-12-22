package laba2;

import mirea.laba1.Comics;

public class TestAuthorUML {
    public static void main(String[] args) {
        AuthorUML f1 = new AuthorUML("li", "-", 'M');
        System.out.println(f1);
        f1.setEmail("li@");
        System.out.println(f1);
    }
}
