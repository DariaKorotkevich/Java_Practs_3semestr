package Pack_6_11;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        Milk milk = new Milk();
        Bread bread = new Bread();

        milk.setWeight(0.9);
        bread.setWeight(0.45);

        ArrayList<Food> products = new ArrayList<>();

        products.add(milk);
        products.add(bread);

        for (Food product :products) {
            product.setCount(r.nextInt(300));
            product.setUnitPrice(r.nextDouble()+ r.nextInt(24)+50);
        }

        Shop shop = new Shop("Shop", milk, bread);
        Shop shop1 = new Shop("Shop1", milk, bread);

        ArrayList <Shop> shops = new ArrayList<>();
        shops.add(shop1);
        shops.add(shop);

        Book book = new Book("The Best", "Grim", 2020);
        Journal journal = new Journal("LV", shops );

        Book book1 = new Book("Crown", "Bardugo", 1999);
        Journal journal1 = new Journal("DolceMilk", shops );

        ArrayList <Printable> forPrint = new ArrayList<>();
        forPrint.add(book);
        forPrint.add(journal);
        forPrint.add(book1);
        forPrint.add(journal1);

        for (Printable printable :forPrint) {
            printable.print();
        }

        System.out.println();
        journal.printJournal(forPrint);
        System.out.println();
        book.printBook(forPrint);
    }

}

