package mirea.laba1;

import java.lang.*;
public class Frisbi {
    private int diametr1;
    private int diametr2;
    private String name;

    public Frisbi(int di1,int di2,String n)
    {
        diametr1=di1;
        diametr2=di2;
        name=n;
    }
    public Frisbi()
    {
        diametr1= 1;
        diametr2= 2;
        name= "Frisbi";
    }
    public Frisbi(int di1,int di2)
    {
        diametr1=di1;
        diametr2=di2;
        name="Frisbi";
    }
    public Frisbi(String n)
    {
        diametr1= 1;
        diametr2= 2;
        name= n;
    }
    public Frisbi(int di1)
    {
        diametr1= di1;
        diametr2= 2;
        name= "Frisbi";
    }

    public void setDiametr1(int diametr1){
        this.diametr1=diametr1;
    }
    public void setDiametr2(int diametr2){
        this.diametr2=diametr2;
    }
    public int getDiametr1(){
        return diametr1;
    }
    public int getDiametr2(){
        return diametr2;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String toString() {
        return "Имя: "+this.name + ", Диаметр1 =  "+ this.diametr1+", Диаметр2 = "+ this.diametr2;
    }
    public void FlightRange(){
        System.out.println(name+ ", Дальность полета: "+ diametr1*diametr2 + " метра");
    }
}
