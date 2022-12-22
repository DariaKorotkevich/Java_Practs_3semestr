package Pack_6_11;

import java.util.ArrayList;

public class Journal implements Printable {
    String nameOfJournal;
    ArrayList <Shop> shops = new ArrayList<>();
    public Journal(String nameOfJournal, ArrayList<Shop> shops){
        this.nameOfJournal = nameOfJournal;
        this.shops = shops;
    }

    public static void printJournal(ArrayList<Printable>  printables){
        for (Printable printable: printables) {
            if (printable instanceof Journal){
                printable.print();
            }
        }
    }
    @Override
    public void print() {
        System.out.println(nameOfJournal);
    }
}

