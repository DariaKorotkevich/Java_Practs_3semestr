package mirea.laba1;

public class TestComics {
    public static void main(String[] args){
        Comics f0 = new Comics();
        Comics f1 = new Comics("Nikem", 1999, "Nikto");

        System.out.println(f0);
        f0.setName("U");
        System.out.println(f0);
        System.out.println(f1);
        f1.setDateOut(1978);
        f1.Life();
    }
}
