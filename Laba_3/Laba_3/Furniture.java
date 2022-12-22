package Laba_3;

//import com.sun.xml.internal.bind.v2.runtime.SwaRefAdapter;

public abstract class Furniture {
    protected String name;
    protected String room;
    protected String country = "none";

    public Furniture(String name,String room){
        this.name=name;
        this.room=room;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setRoom(String room){
        this.room=room;
    }
    public abstract void setCountry(String country);
    /*public void setColor(String color){
        this.color=color;
    }*/
    public String getName(){
        return name;
    }
    public String getRoom(){
        return room;
    }
   /* public String getColor(){
        return color;
    }*/
}
class Divan extends Furniture {
    protected String softness;
    public Divan(String name, String room, String softness) {
        super(name, room);
        this.softness=softness;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String toString() {
        return "ForRoom: " + this.room + ", Name: " + this.name + ", Softness: " + this.softness + ", Country: " + this.country;
    }
}
class Wardrobe extends Furniture {
    protected int weight;
    public Wardrobe(String name, String room, int weight) {
        super(name, room);
        this.weight=weight;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String toString() {
        return "ForRoom: " + this.room + ", Name: " + this.name + ", Weight: " + this.weight + ", Country: " + this.country;
    }
}

