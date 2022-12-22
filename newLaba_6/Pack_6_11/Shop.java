package Pack_6_11;

import Pack_6_11.Milk;
import Pack_6_11.Printable;
import Pack_6_11.Bread;

public class Shop implements Printable {
    String nameOfShop;
    Milk milk;
    Bread bread;
    public Shop(String nameOfShop, Milk milk, Bread bread){
        this.nameOfShop = nameOfShop;
        this.milk = milk;
        this.bread = bread;

    }
    @Override
    public String toString() {
        return "Shop{" + "nameOfShop='" + nameOfShop + '\'' + ", milk=" + milk + ", bread=" + bread + '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
