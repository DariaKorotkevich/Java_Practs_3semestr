package Laba_3;
//import

public class TestFurniture {
    public static void main(String[] args){
        Divan d1 =new Divan("divan","kitchen","soft");
        Wardrobe w1 = new Wardrobe("wardrobe","room",55);
        System.out.println(d1);
        System.out.println(w1);
        d1.setCountry("Russia");
        w1.setCountry("Belarus");
        System.out.println(d1);
        System.out.println(w1);
    }
}
