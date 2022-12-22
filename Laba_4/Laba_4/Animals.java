package Laba_4;

public class Animals implements Nameable{
    String name;
    Animals(String name){
        this.name=name;
    }
    public void getName(){
         System.out.println(name);
    }
}
