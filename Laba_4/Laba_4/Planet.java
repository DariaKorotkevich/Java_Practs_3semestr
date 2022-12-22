package Laba_4;

public class Planet implements Nameable{
    String name;
    Planet(String name){
        this.name=name;
    }
    public void getName(){
         System.out.println(name);
    }
}
